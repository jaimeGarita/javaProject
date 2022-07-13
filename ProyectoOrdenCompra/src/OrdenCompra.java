import java.util.Date;

public class OrdenCompra {

    /*ATRIBUTOS*/
    private static int identificador ;
    private static int ultimoId = 0;
    private String descripcion;
    private Date date;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private int iProductos = 0;




    /*CONSTRUCTORES*/
    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        OrdenCompra.identificador = ultimoId++;
    }

    /*GETTER AND SETTER*/
    public int getIdentificador() {
        return identificador;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getDate() {
        return date;
    }

    public Cliente getCliente() {
        return cliente;
    }


    public void setDate(Date date) {
        this.date = date;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /*METHOD ADD*/
    public void addProducto (Producto producto){
        if(iProductos < this.productos.length){
            this.productos[iProductos++] = producto;
        }
    }

    /*METHODS*/
    public int totalProductos() {
        int total = 0;
        if (iProductos < productos.length) {
            for (Producto p : productos) {
                total += p.getPrecio();
            }
        }
        return total;
    }

}
