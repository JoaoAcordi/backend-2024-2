package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] listaFilmes = {"Homens de preto", "Arrival", "Shrek", "Gladiador"};
        Scanner leitor = new Scanner(System.in);

        System.out.println("Pergunta 1: Que ambientação você prefere:");
        System.out.println("1) Sci-fi");
        System.out.println("2) Medieval");
        int ambientacao = leitor.nextInt();

        System.out.println("Pergunta 2: Que gênero você prefere:");
        System.out.println("1) Comédia");
        System.out.println("2) Drama");
        int genero = leitor.nextInt();

        int indiceFilme = (ambientacao - 1) * 2 + (genero - 1);

        if (indiceFilme >= listaFilmes.length) {
            System.out.println("Nenhuma recomendação disponível para a combinação selecionada.");
        } else {
            String filmeRecomendado = listaFilmes[indiceFilme];
            System.out.println(String.format("Filme Recomendado: %s", filmeRecomendado));
        }
    }
}