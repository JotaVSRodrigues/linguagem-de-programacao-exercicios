package school.sptech.musica;

public class Musica {
    private String nome;
    private String genero;
    private String album;
    private String artista;
    private Integer duracao; // em segundos


    public Musica(String nome, String genero, String album, String artista, Integer duracao) {
        this.nome = nome;
        this.genero = genero;
        this.album = album;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }
}
