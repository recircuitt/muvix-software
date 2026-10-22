package com.Muvix.publication.infraestructure.entrypoints.rest.mapper;
import com.Muvix.publication.infraestructure.adapters.persistence.PublicationEntity;
import com.muvix.infraestructure.entrypoints.rest.dto.PublicationResponseDto;
import com.Muvix.publication.domain.model.Publication;
import org.mapstruct.Mapper;
import com.Muvix.publication.infraestructure.entrypoints.rest.dto.CreatePublicationRequest;
@Mapper(componentModel = "spring")
public interface PublicationMapper {
    PublicationResponseDto toDto(Publication publication);

    Publication toDomain(CreatePublicationRequest request);
}
