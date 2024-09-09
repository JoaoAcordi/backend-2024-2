package com.example.Exercicio07;

public class Filme {
    private String nome;
    private String genero;
    private String ambiente;

    public Filme(String nome, String genero, String ambiente) {
        this.nome = nome;
        this.genero = genero;
        this.ambiente = ambiente;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getAmbiente() {
        return ambiente;
    }
}

