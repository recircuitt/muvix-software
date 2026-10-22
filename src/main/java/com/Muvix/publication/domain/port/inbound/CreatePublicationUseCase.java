package com.Muvix.publication.domain.port.inbound;


import com.Muvix.publication.domain.model.Publication;
import com.Muvix.publication.infraestructure.entrypoints.rest.dto.CreatePublicationRequest;
import com.muvix.infraestructure.entrypoints.rest.dto.PublicationResponseDto;


public interface CreatePublicationUseCase  {
    Publication execute(Publication publication);
}
