package MODEL;

public class Factura {
    int id;
    int cantidad;

    public Factura() {}

    public Factura(int id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                '}';
    }
}
