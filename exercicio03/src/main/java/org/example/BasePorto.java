package org.example;

import java.util.ArrayList;
import java.util.List;

public class BasePorto {
    private String nome;
    protected List<Barco> barcosAtracados;

    public BasePorto(String nome) {
        this.nome = nome;
        this.barcosAtracados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void atracarBarco(Barco barco) {
        barcosAtracados.add(barco);
        System.out.println(barco.getNome() + " atracado no " + nome);
    }

    public void desatracarBarco(Barco barco) {
        barcosAtracados.remove(barco);
        System.out.println(barco.getNome() + " desatracado do " + nome);
    }

    @Override
    public String toString() {
        return "Porto{" +
                "nome='" + nome + '\'' +
                ", barcosAtracados=" + barcosAtracados +
                '}';
    }
}
