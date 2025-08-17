package com.algaworks.algafoods.service;

import com.algaworks.algafoods.domain.model.FormaPagamento;
import com.algaworks.algafoods.domain.repository.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagamentoService {

    @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;

    public List<FormaPagamento> listar(){
        return formaPagamentoRepository.findAll();
    }
}
