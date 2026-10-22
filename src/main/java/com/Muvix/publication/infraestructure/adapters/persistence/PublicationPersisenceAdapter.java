package com.Muvix.publication.infraestructure.adapters.persistence;

import com.Muvix.publication.domain.model.Publication;
import com.Muvix.publication.domain.port.outbound.PublicationRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PublicationPersisenceAdapter implements PublicationRepositoryPort {
    private final SpringDataPublicationRepository springDataPublicationRepository;

    public PublicationPersisenceAdapter(SpringDataPublicationRepository springDataPublicationRepository) {
        this.springDataPublicationRepository = springDataPublicationRepository;
    }
    @Override
    public Publication save(Publication publication) {
        PublicationEntity entity = PublicationEntityMapper.toEntity(publication);
        PublicationEntity savedEntity = springDataPublicationRepository.save(entity);
        return PublicationEntityMapper.toDomain(savedEntity);
    }

    @Override
    public Optional<Publication> findById(Long id) {
        return springDataPublicationRepository.findById(id)
                .map(PublicationEntityMapper::toDomain);
    }

    @Override
    public List<Publication> findAll() {
        return springDataPublicationRepository.findAll().stream()
                .map(PublicationEntityMapper::toDomain)
                .toList();
    }
}
