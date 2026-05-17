package EJERCICIO2;

public class Animales {
    private int idAnimal;
    private String nombre;
    private int edad;
    private String razaL;

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRazaL() {
        return razaL;
    }

    public void setRazaL(String razaL) {
        this.razaL = razaL;
    }

    @Override
    public String toString() {
        return "Animales{" +
                "idAnimal=" + idAnimal +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", razaL='" + razaL + '\'' +
                '}';
    }
}
