package es.jgarita.appfacturas.model;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int id;
    private String descripcion;
    private Date fecha;

    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEM = 10;
    private static int ultimoId;


    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[Factura.MAX_ITEM];
        this.id = ++ultimoId;
        this.fecha = new Date(); //default
    }

    public int getId() {
        return id;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item){
        if (indiceItems < MAX_ITEM) {
            this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal(){
        float total = 0.0f;
        for (int i = 0 ; i<indiceItems; i++){
            total += this.items[i].calculcarImporte();
        }
        return total;
    }

    public String generarDetalle(){
        StringBuilder sb = new StringBuilder("Factura Nº:");
        sb.append(id).
                append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(cliente.getNif())
                .append("\n Descripcion: ")
                .append(this.descripcion)
                .append("\n");
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emisión: ").append(df.format(this.fecha)).append("\n");
                sb.append("\n#\tNombre\t$\tCant.\tTotal\n");



        for (int i = 0; i<indiceItems; i++){


            sb.append(items[i].toString())
                    .append("\n");
        }
        sb.append("\n Gran total: ")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
