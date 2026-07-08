package elufka.software.muvix.dto.request;

import elufka.software.muvix.enums.ProductState;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequestDto {
    @NotBlank(message = "name is requiered")
    private String name;

    private String description;

    @NotEmpty(message = "State is required")
    private ProductState state;
    @NotNull(message = "qunatity is required")
    @Positive(message = "quantity must be positive")
    private Integer quantity;
    @NotNull(message = "price is requiered")
    @Positive(message = "price must be positive")
    private Integer price;
}
