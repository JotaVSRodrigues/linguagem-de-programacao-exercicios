package school.sptech;

import school.sptech.musica.Musica;
import school.sptech.musica.Playlist;
import school.sptech.musica.Usuario;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Joao", "joao@gmail.com", "11999990101");

        Musica musica01 = new Musica("Human Nature", "pop", "Thriller", "Michael Jackson", 300);
        Musica musica02 = new Musica("We Are The Champions", "rock", "Bohemian Rhapsody", "Queen", 500);
        Musica musica03 = new Musica("Boate Azul", "sertanejo", "Acustico ao Vivo", "Bruno & Marrone", 290);


        Playlist playlist01 = new Playlist("As mais mais", usuario1, new ArrayList<>());
        playlist01.adicionarMusica(musica01);
        System.out.println();
    }
}