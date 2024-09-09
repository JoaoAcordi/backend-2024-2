package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema();

        // Adicionando filmes ao cinema
        cinema.adicionarFilme(new Filme("Hulk", 20.0, 12));
        cinema.adicionarFilme(new Filme("Desafio em Tokyo", 25.0, 10));
        cinema.adicionarFilme(new Filme("Gente grande", 22.0, 15));
        cinema.adicionarFilme(new Filme("Minecraft o filme", 18.0, 8));
        cinema.adicionarFilme(new Filme("Invocação do mal", 30.0, 14)); 

        while (true) {
            System.out.println("Filmes disponíveis:");
            for (Filme filme : cinema.getFilmesDisponiveis()) {
                System.out.println(filme.getNome());
            }

            System.out.print("Que filme você deseja assistir? ");
            String nomeFilme = scanner.nextLine();
            Filme filmeEscolhido = null;
            for (Filme filme : cinema.getFilmesDisponiveis()) {
                if (filme.getNome().equalsIgnoreCase(nomeFilme)) {
                    filmeEscolhido = filme;
                    break;
                }
            }

            if (filmeEscolhido == null) {
                System.out.println("Filme não encontrado!");
                continue;
            }

            System.out.print("Qual assento você deseja? ");
            String assento = scanner.nextLine();

            System.out.print("Qual o seu nome? ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Qual a sua idade? ");
            int idadeCliente = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            Cliente cliente = new Cliente(nomeCliente, idadeCliente);
            Ingresso ingresso = new Ingresso(cliente, filmeEscolhido, assento);

            try {
                cinema.venderIngresso(ingresso);
                System.out.println("Ingresso vendido com sucesso! " + filmeEscolhido.getNome() + " - " + assento + " - " + nomeCliente);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Deseja vender outro ingresso? (sim/não) ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("não")) {
                break;
            }
        }

        scanner.close();
    }
}
