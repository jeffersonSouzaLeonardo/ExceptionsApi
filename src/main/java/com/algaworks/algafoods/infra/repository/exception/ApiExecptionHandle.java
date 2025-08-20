package com.algaworks.algafoods.infra.repository.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ApiExecptionHandle extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<?> responseException(NegocioException e){
        ErroDto erro = ErroDto.builder().dataHora(LocalDateTime.now()).mensagem(e.getMessage()).causa(e.getCause().toString()).build();
        return ResponseEntity.badRequest().body(erro);
    }
}
