package com.Muvix.publication.domain.exceptions;

public class PublicationNotFound extends RuntimeException {
    public PublicationNotFound(String message) {
        super(message);
    }
}
