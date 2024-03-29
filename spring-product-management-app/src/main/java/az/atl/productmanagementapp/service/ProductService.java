package az.atl.productmanagementapp.service;

import az.atl.productmanagementapp.dao.entity.ProductEntity;
import az.atl.productmanagementapp.dao.repository.ProductRepository;
import az.atl.productmanagementapp.exception.ProductNotFoundException;
import az.atl.productmanagementapp.mapper.ProductMapper;
import az.atl.productmanagementapp.model.dto.ProductDto;
import az.atl.productmanagementapp.model.enums.StockStatus;
import az.atl.productmanagementapp.model.request.CreateProductRequest;
import az.atl.productmanagementapp.model.request.UpdateProductRequest;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Log4j2
@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    public List<ProductDto> findAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::toDto)
                .collect(Collectors.toList());
    }

    public ProductDto findById(long id) {
        return productRepository.findById(id)
                .map(productMapper::toDto)
                .orElseThrow(() -> new ProductNotFoundException("Product with id [" + id + "] not found!"));
    }

    @Transactional
    public ProductDto createProduct(CreateProductRequest request) {
        final ProductEntity productEntity = ProductEntity.builder()
                .name(request.getName())
                .price(request.getPrice())
                .stockStatus(request.getStockStatus())
                .build();
        log.info("Create product request with body: [{}]", productEntity);
        ProductEntity savedEntity = productRepository.save(productEntity);
        log.info("Create product response with body: [{}]", savedEntity);
        return productMapper.toDto(savedEntity);
    }

    @Transactional
    public ProductDto updateProduct(long id, UpdateProductRequest request) {
        ProductEntity productEntity = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product with id [" + id + "] not found!"));
        productEntity.setPrice(request.getPrice());
        productEntity.setStockStatus(request.getStockStatus());
        return productMapper.toDto(productRepository.save(productEntity));
    }

    @Transactional
    public void deleteProduct(long id) {
        productRepository.findById(id)
                .ifPresent(productEntity -> productRepository.deleteById(id));
    }

    @Scheduled(fixedRate = 3, timeUnit = TimeUnit.SECONDS, initialDelay = 10)
    public void gatherStock() {
        System.out.println(Thread.currentThread().getName());
        productRepository.findAllByStockStatus(StockStatus.UNAVAILABLE)
                .forEach(System.out::println);
    }

    @Scheduled(cron = "4 23 * * * *")
    public void gatherStock2() {
        System.out.println(Thread.currentThread().getName());
        productRepository.findAllByStockStatus(StockStatus.AVAILABLE)
                .forEach(System.out::println);
    }

}
