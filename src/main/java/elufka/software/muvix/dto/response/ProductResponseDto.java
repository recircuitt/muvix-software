package elufka.software.muvix.dto.response;


import elufka.software.muvix.enums.ProductState;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponseDto {
    private String name;
    private String description;
    private ProductState state;
    private Integer quantity;
    private Integer price;
}
