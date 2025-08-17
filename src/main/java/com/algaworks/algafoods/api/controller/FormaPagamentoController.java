package com.algaworks.algafoods.api.controller;

import com.algaworks.algafoods.domain.model.FormaPagamento;
import com.algaworks.algafoods.domain.repository.FormaPagamentoRepository;
import com.algaworks.algafoods.service.FormaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/formaPagamento")
public class FormaPagamentoController {

    @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;

    @Autowired
    private FormaPagamentoService formaPagamentoService;

    @GetMapping("/listar")
    public ResponseEntity<List<FormaPagamento>> listar(){
        return ResponseEntity.ok(formaPagamentoService.listar());
    }
}


