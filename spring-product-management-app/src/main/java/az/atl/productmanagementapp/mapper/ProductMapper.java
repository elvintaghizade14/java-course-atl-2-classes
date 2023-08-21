package az.atl.productmanagementapp.mapper;

import az.atl.productmanagementapp.dao.entity.ProductEntity;
import az.atl.productmanagementapp.model.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper extends EntityMapper<ProductDto, ProductEntity> {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

}
