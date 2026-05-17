package Poblacion;

public class Poblacion {
    private String nombre;
    private String codigosPostales;
    private Integer id;

    public Poblacion() {

    }
    public Poblacion(String nombre, String codigosPostales, Integer id) {
        this.nombre = nombre;
        this.codigosPostales = codigosPostales;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigosPostales() {
        return codigosPostales;
    }

    public void setCodigosPostales(String codigosPostales) {
        this.codigosPostales = codigosPostales;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Poblacion{" +
                "nombre='" + nombre + '\'' +
                ", codigosPostales='" + codigosPostales + '\'' +
                ", id=" + id +
                '}';
    }
}
