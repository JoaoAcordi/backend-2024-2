package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Filme> filmesDisponiveis;
    private List<Ingresso> ingressosVendidos;
    private boolean[][] assentosDisponiveis;

    public Cinema() {
        filmesDisponiveis = new ArrayList<>();
        ingressosVendidos = new ArrayList<>();
        assentosDisponiveis = new boolean[6][5]; // A-F e 1-5

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                assentosDisponiveis[i][j] = true;
            }
        }
    }

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public boolean verificarIdade(Filme filme, Cliente cliente) {
        return cliente.getIdade() >= filme.getIdadeMinima();
    }

    public boolean verificarAssentoDisponivel(String assento) {
        int linha = assento.charAt(0) - 'A';
        int coluna = Character.getNumericValue(assento.charAt(1)) - 1;
        return assentosDisponiveis[linha][coluna];
    }

    public void marcarAssentoComoIndisponivel(String assento) {
        int linha = assento.charAt(0) - 'A';
        int coluna = Character.getNumericValue(assento.charAt(1)) - 1;
        assentosDisponiveis[linha][coluna] = false;
    }

    public void venderIngresso(Ingresso ingresso) throws Exception {
        if (!verificarAssentoDisponivel(ingresso.getAssento())) {
            throw new Exception("O ingresso não pode ser vendido pois seu assento não está mais disponível!");
        }

        if (!verificarIdade(ingresso.getFilme(), ingresso.getCliente())) {
            throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
        }

        marcarAssentoComoIndisponivel(ingresso.getAssento());
        ingressosVendidos.add(ingresso);
    }

    public List<Filme> getFilmesDisponiveis() {
        return filmesDisponiveis;
    }

    public List<Ingresso> getIngressosVendidos() {
        return ingressosVendidos;
    }
}

