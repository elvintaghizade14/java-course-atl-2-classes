package az.atl.productmanagementapp.model.request;

import az.atl.productmanagementapp.model.enums.StockStatus;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProductRequest {

    @Min(0)
    private BigDecimal price;

    @NotNull
    private StockStatus stockStatus;

}
