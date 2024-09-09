package com.example.Exercicio07;

import com.example.Exercicio07.Cinema;
import com.example.Exercicio07.Filme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmeController {
    private Cinema cinema;

    public FilmeController() {
        this.cinema = new Cinema();
    }

    @GetMapping("/recomendar")
    public String recomendarFilme(@RequestParam String genero, @RequestParam String ambiente) {
        for (Filme filme : cinema.getFilmesDisponiveis()) {
            if (filme.getGenero().equalsIgnoreCase(genero) && filme.getAmbiente().equalsIgnoreCase(ambiente)) {
                return filme.getNome();
            }
        }
        return "Nenhuma sugestão encontrada";
    }
}
