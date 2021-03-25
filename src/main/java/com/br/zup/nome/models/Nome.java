package com.br.zup.nome.models;

public class Nome {
    private String nome;

    public Nome() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

//5) Criar um endpoint/API que recebe uma palavra através de um POST e retorne a mesma palavra de trás
// pra frente.

//Exemplo:

//POST
//{
//  "palavra": "Kaio"
//}
//
//Retorno:
//{
//  "palavra": "oiaK"
//}
