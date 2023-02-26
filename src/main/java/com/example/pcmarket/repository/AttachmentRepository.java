package com.example.pcmarket.repository;

import com.example.pcmarket.entity.Attachment;
import com.example.pcmarket.entity.AttachmentContent;
import com.example.pcmarket.projection.CustomAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(path = "attachment", collectionResourceRel = "list", excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}

