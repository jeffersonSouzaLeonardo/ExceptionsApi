package com.algaworks.algafoods.api.controller;


import com.algaworks.algafoods.domain.model.Restaurante;
import com.algaworks.algafoods.infra.repository.exception.RestauranteNaoEncontradoException;
import com.algaworks.algafoods.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @GetMapping("/listar")
    public ResponseEntity<List<Restaurante>> listar() {
        var lista = restauranteService.listar();

        return ResponseEntity.ok(lista);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> buscarId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(restauranteService.buscarId(id));

    }

    @DeleteMapping("/excluir")
    @ResponseStatus(HttpStatus.OK)
    public void excluir(Long id) {
    }

    @PostMapping("/editar")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Restaurante> editar(@RequestBody Restaurante restaurante) {
        return ResponseEntity.ok(restauranteService.salvar(restaurante));
    }


}
