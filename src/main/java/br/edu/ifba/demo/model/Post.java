package br.edu.ifba.demo.model;

public class Post {
    private Long id;
    private String titulo;
    private String texto;
    private Usuario usuario;
    private Categoria categoria;

    public Long getId() {
        return id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
