package com.example.pcmarket.projection;

import com.example.pcmarket.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();
    String getName();
    String getSize();
    String getContentType();
}

