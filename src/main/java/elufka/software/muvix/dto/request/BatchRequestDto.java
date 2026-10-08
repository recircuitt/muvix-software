package elufka.software.muvix.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BatchRequestDto {
    @NotBlank(message = "name is requiered")
    private String name;

    @NotBlank(message = "description of products is required")
    private String description;

    @NotNull(message = "price is requiered")
    @Positive(message = "price must be positive")
    private Integer price;

}
