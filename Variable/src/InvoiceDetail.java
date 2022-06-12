import java.util.Scanner;

/*requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:

        Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.

        Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).

        Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

        Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.*/

public class InvoiceDetail {
    public static void main(String[] args) {

        double price = 0;
        double price1 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select invoice name ");
            String nameInvoice = scanner.nextLine();

        System.out.println("Select first price");   
            price = scanner.nextDouble();
            
        System.out.println("Select second price");       
            price1 = scanner.nextDouble();

            double resultTotalAmount = (price+price1)*1.19;
            double result = (price+price1);

        String total = "Name invoice = " + nameInvoice +" Price 1 = "+ String.valueOf(price) +" Price 2 = "+ String.valueOf(price1) +" Result ="+ String.valueOf(result) + " With total amount" + String.valueOf(resultTotalAmount);
        System.out.println(total);

    }
}
