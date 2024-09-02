package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Barco barco1 = new Barco("Barco A", 5);
        Barco barco2 = new Barco("Barco B", 10);
        Barco barco3 = new Barco("Barco C", 12);
        Barco barco4 = new Barco("Barco D", 8);
        Barco barco5 = new Barco("Barco E", 15);

        PortoPequeno portoPequeno = new PortoPequeno("Porto Pequeno");
        PortoGrande portoGrande = new PortoGrande("Porto Grande");

        List<Barco> barcos = List.of(barco1, barco2, barco3, barco4, barco5);

        for (Barco barco : barcos) {
            System.out.println("Tentando atracar o " + barco.getNome() + "...");
            portoPequeno.atracarBarco(barco);
            if (!portoPequeno.barcosAtracados.contains(barco)) {
                portoGrande.atracarBarco(barco);
            }
        }

        System.out.println(portoPequeno);
        System.out.println(portoGrande);
    }
}
