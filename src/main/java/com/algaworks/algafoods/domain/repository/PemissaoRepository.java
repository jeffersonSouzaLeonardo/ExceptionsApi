package com.algaworks.algafoods.domain.repository;

import com.algaworks.algafoods.domain.model.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PemissaoRepository extends JpaRepository<Permissao, Long> {}
