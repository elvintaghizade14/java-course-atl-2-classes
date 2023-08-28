package az.atl.productmanagementapp.dao.repository;

import az.atl.productmanagementapp.dao.entity.ProductEntity;
import az.atl.productmanagementapp.model.enums.StockStatus;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findAllByStockStatus(StockStatus stockStatus);

}
