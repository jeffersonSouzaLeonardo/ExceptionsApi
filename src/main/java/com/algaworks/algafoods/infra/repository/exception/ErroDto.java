package com.algaworks.algafoods.infra.repository.exception;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class ErroDto {
    private LocalDateTime dataHora;
    private String mensagem;
    private String causa;
}
