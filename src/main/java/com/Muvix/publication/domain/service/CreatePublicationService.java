    package com.Muvix.publication.domain.service;

    import com.Muvix.publication.domain.model.Publication;
    import com.Muvix.publication.domain.port.inbound.CreatePublicationUseCase;
    import com.Muvix.publication.domain.port.outbound.PublicationRepositoryPort;
    import com.Muvix.publication.infraestructure.entrypoints.rest.dto.CreatePublicationRequest;
    import com.muvix.infraestructure.entrypoints.rest.dto.PublicationResponseDto;
    import lombok.RequiredArgsConstructor;
    import org.springframework.stereotype.Service;


    @RequiredArgsConstructor
    @Service
    public class CreatePublicationService implements CreatePublicationUseCase {
        private final PublicationRepositoryPort publicationRepositoryPort;

        @Override
        public Publication execute(Publication publication) {
            return publicationRepositoryPort.save(publication);
        }


    }
