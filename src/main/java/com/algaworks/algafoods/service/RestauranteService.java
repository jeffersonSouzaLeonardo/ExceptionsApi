package com.algaworks.algafoods.service;

import com.algaworks.algafoods.domain.model.Restaurante;
import com.algaworks.algafoods.domain.repository.RestauranteRepository;
import com.algaworks.algafoods.infra.repository.exception.RestauranteNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    public List<Restaurante> listar() {
        return restauranteRepository.findAll();
    }

    public Restaurante buscarId(Long id) {

        try {
            return restauranteRepository.findById(id).get();
        } catch (Exception e) {
            throw new RestauranteNaoEncontradoException(String.format("Restaurante nao encontrado %d", id));
        }
    }

    public Restaurante salvar(Restaurante restaurante) {
        return restauranteRepository.saveAndFlush(restaurante);
    }

}
