package com.algaworks.algafoods.domain.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Embeddable
public class Endereco {
    String endereco_rua;
    String endereco_numero;
    String endereco_bairro;
    String endereco_cep;
    String endereco_complemento;

    @ManyToOne
    @JoinColumn(name = "endereco_id_cidade")
    Cidade endereco_cidade;
}
