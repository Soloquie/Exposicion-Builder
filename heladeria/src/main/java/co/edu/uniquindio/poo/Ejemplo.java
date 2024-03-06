package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class Ejemplo {
    public static void main(String[] args) {
        EnsaladaFrutas ensaladaFrutas = EnsaladaFrutas.builder().banano(true).sandia(true).liquido(Liquido.YOGURT).build();
        Pedido pedido = Pedido.builder().nombre("Joseph Quiso").celular("3172145324").tipoPago(TipoPago.NEQUI).ensaladaFrutas(ensaladaFrutas).build();

        System.out.println("El pedido del señor(a): "+pedido.getNombre()+" con el celular: "+pedido.getCelular()+"Es "+ pedido.getEnsaladaFrutas());
    }
}
