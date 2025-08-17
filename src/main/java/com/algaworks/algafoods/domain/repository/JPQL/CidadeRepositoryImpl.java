package com.algaworks.algafoods.domain.repository.JPQL;

import com.algaworks.algafoods.domain.model.Cidade;
import com.algaworks.algafoods.domain.repository.CidadeRepositoryInterface;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CidadeRepositoryImpl implements CidadeRepositoryInterface {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Cidade> find(String nome, Long id){
        var jpql = "from Cidade where nome like :nome" +
                " or id = :id";

        return entityManager.createQuery(jpql, Cidade.class)
                .setParameter("nome", "%" + nome + "%")
                .setParameter("id", id)
                .getResultList();

    }

    @Override
    public List<Cidade> findCriteria(String nome, Long id) {
        return null;
    }
}
