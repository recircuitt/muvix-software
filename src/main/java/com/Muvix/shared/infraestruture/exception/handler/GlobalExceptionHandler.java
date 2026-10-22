package com.Muvix.shared.infraestruture.exception.handler;

import com.Muvix.publication.domain.exceptions.PublicationNotFound;
import com.Muvix.shared.infraestruture.exception.reponse.ErrorResponseDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.Collections;

@RestControllerAdvice
public class GlobalExceptionHandler {


    //Publication
    @ExceptionHandler(PublicationNotFound.class)
    private ResponseEntity<ErrorResponseDto> handlerRecourseNotFoundException(PublicationNotFound ex, HttpServletRequest request){
        ErrorResponseDto response = new ErrorResponseDto(
                404,
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                ex.getMessage(),
                request.getServletPath(),
                LocalDateTime.now(),
                Collections.emptyMap()
        );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
    }
