package az.atl.productmanagementapp.model.dto;

import az.atl.productmanagementapp.model.enums.StockStatus;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private long id;
    private String name;
    private BigDecimal price;
    private StockStatus stockStatus;


}
