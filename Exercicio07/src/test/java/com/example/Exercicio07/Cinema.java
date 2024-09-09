package com.example.Exercicio07;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Filme> filmesDisponiveis;

    public Cinema() {
        filmesDisponiveis = new ArrayList<>();
        filmesDisponiveis.add(new Filme("Hulk", "acao", "fantasia"));
        filmesDisponiveis.add(new Filme("De Volta para o Futuro", "acao", "futurista"));
        filmesDisponiveis.add(new Filme("O Senhor dos Anéis", "aventura", "fantasia"));
        filmesDisponiveis.add(new Filme("Jurassic park", "ficcao", "fantasia"));
        filmesDisponiveis.add(new Filme("Star Wars", "ficcao", "espaco"));
    }

    public List<Filme> getFilmesDisponiveis() {
        return filmesDisponiveis;
    }
}
