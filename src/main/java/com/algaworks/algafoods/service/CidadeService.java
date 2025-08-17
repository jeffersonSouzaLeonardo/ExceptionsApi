package com.algaworks.algafoods.service;

import com.algaworks.algafoods.domain.model.Cidade;
import com.algaworks.algafoods.domain.repository.CidadeSDJRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {
    @Autowired
    private CidadeSDJRepository cidadeSDJRepository;

    public Cidade salvar(Cidade cidade){
        return cidadeSDJRepository.saveAndFlush(cidade);
    }

    public Cidade editar(Cidade cidade){
        return cidadeSDJRepository.saveAndFlush(cidade);
    }
    public void excluir(Cidade cidade){
         cidadeSDJRepository.delete(cidade);
    }

    public List<Cidade> listar() {
        return cidadeSDJRepository.findAll();
    }

    public Cidade buscarId(long id) {
        return cidadeSDJRepository.findById(id).get();
    }
}
