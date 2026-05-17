package com.FINAL.model;

public class usuario {
    private int id ;
    private String titulo;
    private String artista;
    private int duracion;


    public usuario(int id, String titulo, String artista, int duracion) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;

    }

    public int getId() {
        return id;

    }
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return id + "," + titulo + "," + artista + "," + duracion;
    }
}
