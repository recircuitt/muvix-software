package elufka.software.muvix.dto.response;

import elufka.software.muvix.models.Batch;
import elufka.software.muvix.models.Product;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CollectionResponseDto {
    private String name;

    private List<Batch> batches;
    private List<Product> products;
}
