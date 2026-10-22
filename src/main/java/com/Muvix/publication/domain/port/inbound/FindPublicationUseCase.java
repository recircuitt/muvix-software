package com.Muvix.publication.domain.port.inbound;
import com.Muvix.publication.domain.model.Publication;
import com.muvix.infraestructure.entrypoints.rest.dto.PublicationResponseDto;

import java.util.List;

public interface FindPublicationUseCase {
    Publication findById(Long id);

    List<Publication> findAll();
}
