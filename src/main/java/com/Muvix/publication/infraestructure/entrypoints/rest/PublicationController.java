package com.Muvix.publication.infraestructure.entrypoints.rest;

import com.Muvix.publication.domain.model.Publication;
import com.Muvix.publication.domain.port.inbound.CreatePublicationUseCase;
import com.Muvix.publication.domain.port.inbound.FindPublicationUseCase;
import com.Muvix.publication.infraestructure.entrypoints.rest.dto.CreatePublicationRequest;
import com.Muvix.publication.infraestructure.entrypoints.rest.mapper.PublicationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.muvix.infraestructure.entrypoints.rest.dto.PublicationResponseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/publication")
@RequiredArgsConstructor
public class PublicationController {
    private final CreatePublicationUseCase createPublicationUseCase;
    private final FindPublicationUseCase findPublicationUseCase;
    private final PublicationMapper publicationMapper;

    @PostMapping()
    public ResponseEntity<PublicationResponseDto> create(@RequestBody CreatePublicationRequest request){
        Publication publicationDomain = publicationMapper.toDomain(request);

        Publication savedPublication = createPublicationUseCase.execute(publicationDomain);

        return ResponseEntity.status(HttpStatus.CREATED).body(publicationMapper.toDto(savedPublication));
    }

    public ResponseEntity<PublicationResponseDto> findById(Long id){
        Publication foundedPublication = findPublicationUseCase.findById(id);
        return ResponseEntity.ok(publicationMapper.toDto(foundedPublication));
    }

    public ResponseEntity<List<PublicationResponseDto>> findAll(){
         List<Publication> publications = findPublicationUseCase.findAll();

         return ResponseEntity.ok(
                 publications.stream()
                 .map(publicationMapper::toDto)
                 .toList()
         );
    }

}
