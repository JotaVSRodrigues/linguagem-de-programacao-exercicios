package school.sptech.musica;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas;
    private Usuario dono;

    public Playlist(String nome, Usuario dono, List<Musica> musicas) {
        this.nome = nome;
        this.dono = dono;
        this.musicas = new ArrayList<>(musicas);
    }

    public void adicionarMusica(Musica musica) {
        this.musicas.add(musica);
    }

    public void removerMusica(Musica musica) {
        this.musicas.remove(musica);
    }

    public Integer calcularDuracaoTotal () {
        Integer duracao = 0;
        for (Musica musica : this.musicas) {
            duracao += musica.getDuracao();
        }
        return duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }
}
