package com.muvix.infraestructure.entrypoints.rest.dto;

import com.muvix.domain.model.Item;

import java.math.BigDecimal;
import java.util.List;

public class PublicationResponseDto {
    Long id;
    String title;
    String description;
    private List<Item> items;
    private Integer quantity;
    private BigDecimal price;
}
