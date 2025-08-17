package com.algaworks.algafoods.domain.repository.Specification;

import com.algaworks.algafoods.domain.model.Cidade;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

@AllArgsConstructor
public class CidadeIdSpec  implements Specification<Cidade> {
    private Long id;

    @Override
    public Predicate toPredicate(Root<Cidade> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        return builder.equal(root.get("id"), id);
    }
}
