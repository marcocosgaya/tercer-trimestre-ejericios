package com.example.demo_proyectofinal.model;

public class Cliente {

    private int id_cliente;
    private String usuario;
    private String password;

    public Cliente() {
    }

    public Cliente(int id_usuario, String usuario, String password, String fecha_creacion) {
        this.id_cliente = id_usuario;
        this.usuario = usuario;
        this.password = password;

    }



    public int getId_cliente() {
        return id_cliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setId_cliente(int id_usuario) {
        this.id_cliente = id_usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
