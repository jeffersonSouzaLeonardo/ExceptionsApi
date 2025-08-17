package com.algaworks.algafoods.infra.repository.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RestauranteNaoEncontradoException extends Exception {

    public RestauranteNaoEncontradoException(String mensagem){
        super(mensagem);
    }

}
