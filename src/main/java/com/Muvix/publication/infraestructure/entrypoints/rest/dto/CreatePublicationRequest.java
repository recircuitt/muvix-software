package com.Muvix.publication.infraestructure.entrypoints.rest.dto;

import com.Muvix.publication.domain.model.Item;
import com.Muvix.publication.domain.model.PublicationStatus;

import java.math.BigDecimal;
import java.util.List;

public class CreatePublicationRequest {
    String title;
    String description;
    private List<Item> items;
    private Integer quantity;
    private BigDecimal price;
}
