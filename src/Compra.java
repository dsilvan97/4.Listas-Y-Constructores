public class Compra implements Comparable<Compra> {
    private String producto;
    private double precio;

    public Compra(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "\nProducto: " + this.producto + "\nValor: " + this.precio;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.precio).compareTo(Double.valueOf(otraCompra.getPrecio()));
    }
}
