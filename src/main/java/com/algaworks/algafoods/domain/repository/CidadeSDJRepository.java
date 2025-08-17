package com.algaworks.algafoods.domain.repository;

import com.algaworks.algafoods.domain.model.Cidade;
import com.algaworks.algafoods.domain.repository.CidadeRepositoryInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CidadeSDJRepository extends JpaRepository<Cidade, Long>{

}
