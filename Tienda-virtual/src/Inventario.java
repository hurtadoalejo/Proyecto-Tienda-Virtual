import java.util.Collection;
import java.util.LinkedList;

public class Inventario {
    private int codigoInventario;
    private Categoria categoria;
    private Collection<Producto> listaProductos;
    private int stock;
    
    /**
     * Metodo constructor de la clase inventario
     * @param codigoInventario Codigo del inventario a crear
     * @param categoria Categoria del inventario a crear
     * @param stock Stock del inventario a crear
     */
    public Inventario(int codigoInventario, Categoria categoria, int stock) {
        this.codigoInventario = codigoInventario;
        this.categoria = categoria;
        this.stock = stock;
        listaProductos = new LinkedList<>();
    }

    /**
     * Metodo para modificar el codigo del inventario
     * @param codigoInventario Nuevo codigo del inventario
     */
    public void setCodigoInventario(int codigoInventario) {
        this.codigoInventario = codigoInventario;
    }
    /**
     * Metodo para modificar la categoria del inventario
     * @param categoria Nueva categoria
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    /**
     * Metodo para modificar la lista de productos del inventario
     * @param listaProductos Nueva lista de productos
     */
    public void setListaProductos(Collection<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    /**
     * Metodo para modificar el stock del inventario
     * @param stock Nuevo stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Metodo para obtener el codigo del inventario
     * @return Codigo del inventario
     */
    public int getCodigoInventario() {
        return codigoInventario;
    }
    /**
     * Metodo para obtener la categoria del inventario
     * @return Categoria del inventario
     */
    public Categoria getCategoria() {
        return categoria;
    }
    /**
     * Metodo para obtener la lista de productos del inventario
     * @return Lista de productos del inventario
     */
    public Collection<Producto> getListaProductos() {
        return listaProductos;
    }
    /**
     * Metodo para obtener el stock del inventario
     * @return Stock del inventario
     */
    public int getStock() {
        return stock;
    }

    /**
     * Metodo para añadir un producto a la lista de productos del inventario
     * @param producto Producto a añadir
     */
    public void agregarProducto(Producto producto) {
        if (verificarProducto(producto.getNombreProducto())) {
            listaProductos.add(producto);
        }
    }
    /**
     * Metodo para verificar duplicado de productos
     * @param nombreProducto Nombre del producto a verificar
     * @return Booleano con respuesta de si hay un producto ya existente
     */
    public boolean verificarProducto(String nombreProducto) {
        boolean centinela = true;
        for (Producto productoPrueba : listaProductos) {
            if (productoPrueba.getNombreProducto().equals(nombreProducto)) {
                centinela = false;
            }
        }
        return centinela;
    }
    /**
     * Metodo para eliminar un producto de la lista de productos del inventario
     * @param nombreProducto Nombre del producto a eliminar
     */
    public void eliminarProducto(String nombreProducto) {
        for (Producto productoPrueba : listaProductos) {
            if (productoPrueba.getNombreProducto().equals(nombreProducto)){
                listaProductos.remove(productoPrueba);
                break;
            }
        }
    }

    /**
     * Metodo para retornar una cadena de texto
     * @return Cadena de texto con informacion del inventario
     */
    public String toString() {
        return "Inventario [codigoInventario=" + codigoInventario + ", categoria=" + categoria + ", listaProductos="
                + listaProductos + ", stock=" + stock + "]";
    }
}