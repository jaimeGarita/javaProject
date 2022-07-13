import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("pedido ordenadores");
        Cliente jaime = new Cliente("Jaime", "Garitagoitia");
        Producto p1 = new Producto("Asus", "PC 1050Ti y Intel i7", 1200);
        orden1.setCliente(jaime);
        orden1.setCliente(jaime);
        orden1.setDate(new Date());

        orden1.addProducto(p1);
        orden1.addProducto(new Producto("Lenovo", "PC I7 3080", 1800));
        orden1.addProducto(new Producto("Msi", "AMD RYZEN 5, 4000", 2000));
        orden1.addProducto(new Producto("xiaomi", "Intel i10, 100000", 30000));

        OrdenCompra orden2 = new OrdenCompra("moviles");
        Cliente paco = new Cliente("Paco", "Ramirez");
        orden2.setCliente(paco);

        orden2.addProducto(new Producto("Samsung", "A13", 130));
        orden2.addProducto(new Producto("Apple", "Iphone x", 1000));
        orden2.addProducto(new Producto("Xiaomi", "MI 11", 500));
        orden2.addProducto(new Producto("Nokia", "Irrompible", 20));

        OrdenCompra orden3 = new OrdenCompra("Ropa");
        Cliente ramon = new Cliente("Ramon", "Rodriguez");
        Date d = new Date();
        orden3.setDate(d);
        orden3.setCliente(ramon);

        orden3.addProducto(new Producto("Shein", "Top xs333", 10));
        orden3.addProducto(new Producto("Berska", "Pantalones vaqueros", 30));
        orden3.addProducto(new Producto("Gucci", "Gafas ultimate", 300));
        orden3.addProducto(new Producto("Nike", "Air force 1", 110));

        OrdenCompra[] ordenes = {orden1, orden2, orden3};

        for (OrdenCompra orden: ordenes) {
            System.out.println("ID: " + orden.getIdentificador());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " +orden.getDescripcion());
            System.out.println("Fecha: " + orden.getDate());
            System.out.println("Total: " + orden.totalProductos());

            int i = 1;
            for (Producto p : orden.getProductos()){
                System.out.println("Producto" + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
            System.out.println("---------------------------------- siguiente --------------------------------------");
        }
    }
}
