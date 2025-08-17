package com.algaworks.algafoods.service;

import com.algaworks.algafoods.domain.model.Restaurante;
import com.algaworks.algafoods.domain.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    public List<Restaurante> listar(){
        return restauranteRepository.findAll();
    }

    public Restaurante buscarId(Long id){
        return restauranteRepository.findById(id).get();
    }

    public Restaurante salvar(Restaurante restaurante){
        return restauranteRepository.saveAndFlush(restaurante);
    }

}
