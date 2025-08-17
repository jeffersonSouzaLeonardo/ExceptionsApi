package com.algaworks.algafoods.api.controller;


import com.algaworks.algafoods.domain.model.Cidade;
import com.algaworks.algafoods.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidade")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @PostMapping("/salvar")
    public ResponseEntity<?> salvar(@RequestBody Cidade cidade){
        try {
            cidade = cidadeService.salvar(cidade);
            return  ResponseEntity.status(HttpStatus.CREATED).body(cidade);

        } catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/editar")
    @ResponseStatus(HttpStatus.OK)
    public Cidade editar(@RequestBody Cidade cidadeNova){

        return cidadeService.editar(cidadeNova);
    }

    @DeleteMapping("/excluir")
    @ResponseStatus(HttpStatus.OK)
    public void excluir(@RequestBody Cidade cidadeNova){
        cidadeService.excluir(cidadeNova);
    }


    @GetMapping("/listar")
    public ResponseEntity<List<Cidade>> listar(){
        return ResponseEntity.status(HttpStatus.OK).body(cidadeService.listar());
        // opcao 2 - ResponseEntity.ok(cidadeRepository.listar());
        // opcao 3 - adicionando os Headers

    }

    @GetMapping("/{cozinhaId}")
    public ResponseEntity<Cidade> buscar(@PathVariable("cozinhaId") Long id){
        return ResponseEntity.ok(cidadeService.buscarId(id));
    }
}


