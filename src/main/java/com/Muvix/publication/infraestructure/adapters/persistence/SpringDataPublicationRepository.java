package com.Muvix.publication.infraestructure.adapters.persistence;

import com.Muvix.publication.domain.model.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataPublicationRepository extends JpaRepository<PublicationEntity,Long> {
}
