package br.com.alura.musics.principal;

import br.com.alura.musics.modelos.Musica;
import br.com.alura.musics.modelos.Podcast;
import br.com.alura.musics.modelos.Preferidas;

public class Main {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("1993");
        musica.setCantor("Matue");

        for (int i = 0; i < 1000; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Bolha dev");
        podcast.setApresentador("Gustavo Guanabara");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);
    }
}
