import java.util.ArrayList;
import java.util.List;

public class TarjetaCredito {

    private double limite;
    private double saldo;

    private List<Compra> listadoDeCompras;

    public TarjetaCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listadoDeCompras = new ArrayList<>();
    }

    public boolean lanzarCompra(Compra compra){
        if (this.saldo >= compra.getPrecio()){
            this.saldo -= compra.getPrecio();
            this.listadoDeCompras.add(compra);
            return true;
        }else {
            return false;
        }
    }

    public double getLimite() {
        return this.limite;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public List<Compra> getListadoDeCompras() {
        return this.listadoDeCompras;
    }
}
