package com.algaworks.algafoods.infra.repository.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class RestauranteNaoEncontradoException extends ResponseStatusException {

    public RestauranteNaoEncontradoException(HttpStatus status, String reason){
        super(status, reason);
    }

    public RestauranteNaoEncontradoException(String mensagem){
        this(HttpStatus.CONFLICT, mensagem);
    }

}
