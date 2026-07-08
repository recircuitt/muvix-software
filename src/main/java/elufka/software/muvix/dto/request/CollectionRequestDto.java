package elufka.software.muvix.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CollectionRequestDto {
    @NotBlank(message = "name is required")
    private String name;
    /*Ponemos solo nombre pq al crear una collection se crea primero y
    * luego puedes añadir productos/lotes*/

}
