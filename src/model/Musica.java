package model;

public class Musica {
    //4 características
    //1 - atributos privados - OK
    //2 - getters and setters
    //3 - construtor
    //4 - toString
    private int codigo;
    private String titulo;
    private String genero;
    private int duracaoMinutos;
    private int anoLancamento;
    private String artista;

    @Override
    public String toString() {
        return "Musica{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracaoMinutos=" + duracaoMinutos +
                ", anoLancamento=" + anoLancamento +
                ", artista='" + artista + '\'' +
                '}';
    }

    public Musica(int codigo, String titulo, String genero, int duracaoMinutos, int anoLancamento, String artista) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.duracaoMinutos = duracaoMinutos;
        this.anoLancamento = anoLancamento;
        this.artista = artista;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
