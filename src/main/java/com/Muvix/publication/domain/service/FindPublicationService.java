package com.Muvix.publication.domain.service;

import com.Muvix.publication.domain.exceptions.PublicationNotFound;
import com.Muvix.publication.domain.model.Publication;
import com.Muvix.publication.domain.port.inbound.FindPublicationUseCase;
import com.Muvix.publication.domain.port.outbound.PublicationRepositoryPort;
import com.Muvix.publication.infraestructure.adapters.persistence.PublicationEntity;
import com.Muvix.publication.infraestructure.adapters.persistence.SpringDataPublicationRepository;
import com.Muvix.publication.infraestructure.entrypoints.rest.mapper.PublicationMapper;
import com.muvix.infraestructure.entrypoints.rest.dto.PublicationResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FindPublicationService implements FindPublicationUseCase {
    private final PublicationRepositoryPort publicationRepositoryPort;
    private final PublicationMapper mapper;

    @Override
    public Publication findById(Long id) {
        return publicationRepositoryPort.findById(id)
                .orElseThrow(() -> new PublicationNotFound("Publicacion con id " + id + "No fue encontrada"));
    }

    @Override
    public List<Publication> findAll() {
        return publicationRepositoryPort.findAll();
    }
}
