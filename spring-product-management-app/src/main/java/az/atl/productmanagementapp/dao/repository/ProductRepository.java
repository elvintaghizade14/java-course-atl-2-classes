package az.atl.productmanagementapp.dao.repository;

import az.atl.productmanagementapp.dao.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
