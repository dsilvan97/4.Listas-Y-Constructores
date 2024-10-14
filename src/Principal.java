import java.util.Collections;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int ejecutando = 1;
        String producto;
        double valor;
        boolean comprado;

        Scanner consola = new Scanner(System.in);

        System.out.println("Escriba el límite de la tarjeta:");
        TarjetaCredito tarjeta = new TarjetaCredito(consola.nextDouble());

        while (ejecutando == 1){
            System.out.println("¿Qué desea comprar?");
            producto = consola.next();
            System.out.println("¿Cuanto cuesta el producto?");
            valor = consola.nextDouble();

            Compra nuevaCompra = new Compra(producto, valor);

            comprado = tarjeta.lanzarCompra(nuevaCompra);

            if (comprado){
                System.out.println("Compra Realizada!");
            }else {
                System.out.println("Saldo insuficiente!");
            }

            System.out.println("¿Desea seguir comprando?\n1 - Si\n0 - No");
            ejecutando = consola.nextInt();
        }

        System.out.println("**************************************");
        Collections.sort(tarjeta.getListadoDeCompras());
        for(Compra compra: tarjeta.getListadoDeCompras()){
            System.out.println(compra.getProducto() + " - " + compra.getPrecio());
        }
        System.out.println("**************************************");
        System.out.println("Su saldo en tarjeta es de: " + String.format("%.2f",tarjeta.getSaldo()));

    }
}