package elufka.software.muvix.models;

import elufka.software.muvix.enums.ProductState;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProductState state;

    @Column(nullable = false)
    private Integer quantity;

    @ManyToOne()
    @JoinColumn(name = "cateogry_id")
    private List<Categories> categories; //Por ahora cada producto tendra una categoria

    @Column(nullable = false)
    private Integer price;

}
