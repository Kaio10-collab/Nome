package com.br.zup.nome.services;

import com.br.zup.nome.models.Nome;
import org.springframework.stereotype.Service;

@Service
public class NomeService {

    public Nome reverterNome(Nome nome){
        String nomeInvertido = new StringBuilder(nome.getNome()).reverse().toString();
        nome.setNome(nomeInvertido);

       return nome;
    }
}
