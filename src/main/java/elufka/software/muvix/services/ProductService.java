package elufka.software.muvix.services;

import elufka.software.muvix.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductService {
    private ProductRepository productRepository;
}
