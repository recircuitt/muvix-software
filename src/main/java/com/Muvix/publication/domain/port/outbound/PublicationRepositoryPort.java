package com.Muvix.publication.domain.port.outbound;

import com.Muvix.publication.domain.model.Publication;
import com.Muvix.publication.infraestructure.adapters.persistence.PublicationEntity;
import com.Muvix.publication.infraestructure.entrypoints.rest.dto.CreatePublicationRequest;

import java.util.List;
import java.util.Optional;

public interface PublicationRepositoryPort {
    Publication save(Publication publication);

    Optional<Publication> findById(Long id);

    List<Publication> findAll();

}
