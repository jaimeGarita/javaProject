package es.jgarita.appfacturas;
import es.jgarita.appfacturas.model.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jaime", "555-5");


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura: ");


        Factura factura = new Factura(sc.nextLine(), cliente);

        Producto producto;


        System.out.println("\n");

        for (int i = 0; i<2; i++){
            Scanner s = new Scanner(System.in);
            producto = new Producto();
            System.out.print("Ingrese producto n " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");

            producto.setPrecio(s.nextInt());

            System.out.print("Ingrese la cantidad: ");


            ItemFactura item = new ItemFactura(s.nextInt(),producto);
            factura.addItemFactura(item);

            System.out.println();
        }
        System.out.println(factura.generarDetalle());
    }
}
