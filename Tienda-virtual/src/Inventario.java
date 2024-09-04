import java.util.Collection;
import java.util.LinkedList;

public class Inventario {
    private int codigoInventario;
    private Categoria categoria;
    private Collection<Producto> listaProductos;
    private int stock;
    
    public Inventario(int codigoInventario, Categoria categoria, int stock) {
        this.codigoInventario = codigoInventario;
        this.categoria = categoria;
        this.stock = stock;
        listaProductos = new LinkedList<>();
    }

    public void setCodigoInventario(int codigoInventario) {
        this.codigoInventario = codigoInventario;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public void setListaProductos(Collection<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCodigoInventario() {
        return codigoInventario;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public Collection<Producto> getListaProductos() {
        return listaProductos;
    }
    public int getStock() {
        return stock;
    }

    public void agregarProducto(Producto producto) {
        if (verificarProducto(producto.getNombreProducto())) {
            listaProductos.add(producto);
        }
    }
    
    public boolean verificarProducto(String nombreProducto) {
        boolean centinela = true;
        for (Producto productoPrueba : listaProductos) {
            if (productoPrueba.getNombreProducto().equals(nombreProducto)) {
                centinela = false;
            }
        }
        return centinela;
    }

    public void eliminarProducto(String nombreProducto) {
        for (Producto productoPrueba : listaProductos) {
            if (productoPrueba.getNombreProducto().equals(nombreProducto)){
                listaProductos.remove(productoPrueba);
                break;
            }
        }
    }

    public String toString() {
        return "Inventario [codigoInventario=" + codigoInventario + ", categoria=" + categoria + ", listaProductos="
                + listaProductos + ", stock=" + stock + "]";
    }
}