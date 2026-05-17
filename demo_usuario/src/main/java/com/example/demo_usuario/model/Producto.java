package com.example.demo_usuario.model;

public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private String talla;
    private String color;

    public Producto() {}

    public Producto(int id, String nombre, double precio, String talla, String color) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.talla = talla;
        this.color = color;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public String getTalla() { return talla; }
    public String getColor() { return color; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setTalla(String talla) { this.talla = talla; }
    public void setColor(String color) { this.color = color; }
}
