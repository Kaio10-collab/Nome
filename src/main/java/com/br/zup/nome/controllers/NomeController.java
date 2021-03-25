package com.br.zup.nome.controllers;

import com.br.zup.nome.models.Nome;
import com.br.zup.nome.services.NomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("nome/")
public class NomeController {

    @Autowired
    private NomeService nomeService;

    @PostMapping
    public Nome nomeInvertido(@RequestBody Nome nome){
        return nomeService.reverterNome(nome);

    }
}
