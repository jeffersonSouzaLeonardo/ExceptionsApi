package com.algaworks.algafoods.domain.repository.Criteria;

import com.algaworks.algafoods.domain.model.Cidade;
import com.algaworks.algafoods.domain.model.Restaurante;
import com.algaworks.algafoods.domain.repository.CidadeRepositoryInterface;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CidadeRepositoryCriteriaImpl implements CidadeRepositoryInterface {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Cidade> find(String nome, Long id) {
        return null;
    }

    @Override
    public List<Cidade> findCriteria(String nome, Long id){
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Cidade> criteriaQuery = criteriaBuilder.createQuery(Cidade.class);
        Root<Cidade> cidadeRoot = criteriaQuery.from(Cidade.class);

        Predicate nomePredicate = criteriaBuilder.like(cidadeRoot.get("nome"),"%" + nome + "%");
        Predicate idPredicate = criteriaBuilder.equal(cidadeRoot.get("id"), id);

        criteriaQuery.where(criteriaBuilder.or(nomePredicate, idPredicate));

        TypedQuery<Cidade> resultQuery = entityManager.createQuery(criteriaQuery);
        return resultQuery.getResultList();
    }
}
