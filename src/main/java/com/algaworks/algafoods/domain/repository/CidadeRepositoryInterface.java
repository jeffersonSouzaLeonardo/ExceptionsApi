package com.algaworks.algafoods.domain.repository;

import com.algaworks.algafoods.domain.model.Cidade;

import java.util.List;

public interface CidadeRepositoryInterface {
    List<Cidade> find(String nome, Long id);
    List<Cidade> findCriteria(String nome, Long id);
}
