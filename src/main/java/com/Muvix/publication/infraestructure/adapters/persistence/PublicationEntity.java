package com.Muvix.publication.infraestructure.adapters.persistence;

import jakarta.persistence.*;

import com.Muvix.publication.domain.model.Item;
import com.Muvix.publication.domain.model.PublicationStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PublicationEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Integer quantity;
    private PublicationStatus status;
    private BigDecimal price;
    @OneToMany(mappedBy="item_id")
    private List<Item> items;
    private LocalDateTime createdAt;

    @PrePersist()
    protected void onCreate(){
        createdAt = LocalDateTime.now();
        status = PublicationStatus.AVAILABLE;
    }
}
