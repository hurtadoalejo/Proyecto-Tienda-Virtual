import java.util.Collection;
import java.util.LinkedList;

public class Tienda {
    private String nombre;
    private Collection<Inventario> listaInventarios;
    private Collection<Proveedor> listaProveedores;

    /**
     * Metodo constructor de la clase tienda
     * @param nombre Nombre de la tienda a crear
     */
    public Tienda(String nombre) {
        this.nombre = nombre;
        listaInventarios = new LinkedList<>();
        listaProveedores = new LinkedList<>();
    }

    /**
     * Metodo para modificar el nombre de la tienda
     * @param nombre Nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para modificar la lista de inventarios de la tienda
     * @param inventario Nueva lista de inventarios
     */
    public void setInventario(Collection<Inventario> inventarios) {
        this.listaInventarios = inventarios;
    }
    /**
     * Metodo para modificar la lista de proveedores de la tienda
     * @param proveedor Nueva lista de proveedores
     */
    public void setProveedor(Collection<Proveedor> proveedores) {
        this.listaProveedores = proveedores;
    }

    /**
     * Metodo para obtener el nombre de la tienda
     * @return Nombre de la tienda
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para obtener la lista de inventarios de la tienda
     * @return lista de inventarios de la tienda
     */
    public Collection<Inventario> getInventario() {
        return listaInventarios;
    }
    /**
     * Metodo para obtener la lista de proveedores de la tienda
     * @return lista de proveedores de la tienda
     */
    public Collection<Proveedor> getProveedor() {
        return listaProveedores;
    }

    /**
     * Metodo para agregar un inventario a la lista de inventarios
     * @param inventario Inventario a agregar
     */
    public void agregarInventario(Inventario inventario) {
        if (verificarInventario(inventario.getCodigoInventario())){
            listaInventarios.add(inventario);
        }
    }
    
    /**
     * Metodo para verificar duplicado de inventarios
     * @param codigoInventario Codigo del inventario a verificar
     * @return Booleano con respuesta de si hay un inventario ya existente
     */
    public boolean verificarInventario(int codigoInventario) {
        boolean centinela = true;
        for (Inventario inventarioPrueba : listaInventarios) {
            if (inventarioPrueba.getCodigoInventario() == codigoInventario){
                centinela = false;
            }
        }
        return centinela;
    }

    /**
     * Metodo para eliminar un inventario de la lista de inventarios
     * @param codigoInventario Codigo del inventario a eliminar
     */
    public void eliminarInventario(int codigoInventario) {
        for (Inventario inventarioPrueba : listaInventarios) {
            if (inventarioPrueba.getCodigoInventario() == codigoInventario){
                listaInventarios.remove(inventarioPrueba);
                break;
            }
        }
    }

    /**
     * Metodo para agregar un proveedor a la lista de proveedores
     * @param proveedor Proveedor a agregar
     */
    public void agregarProveedor(Proveedor proveedor) {
        if (verificarProveedor(proveedor.getIdProveedor())){
            listaProveedores.add(proveedor);
        }
    }
    
    /**
     * Metodo para verificar el duplicado de proveedor
     * @param idProveedor id del proveedor a verificar
     * @return Booleano con respuesta de si hay un proveedor ya existente
     */
    public boolean verificarProveedor(int idProveedor) {
        boolean centinela = true;
        for (Proveedor proveedorPrueba : listaProveedores) {
            if (proveedorPrueba.getIdProveedor() == idProveedor){
                centinela = false;
            }
        }
        return centinela;
    }

    /**
     * Metodo para eliminar un proveedor de la lista de proveedores
     * @param idProveedor id del proveedor a eliminar
     */
    public void eliminarProveedor(int idProveedor) {
        for (Proveedor proveedorPrueba : listaProveedores) {
            if (proveedorPrueba.getIdProveedor() == idProveedor){
                listaProveedores.remove(proveedorPrueba);
                break;
            }
        }
    }

    /**
     * Metodo para actualizar el stock de un inventario
     * @param codigoInventario Codigo del inventario a actualizar
     * @param nuevoStock Nuevo stock del inventario
     */
    public void actualizarStock(int codigoInventario, int nuevoStock){
        for (Inventario inventarioPrueba : listaInventarios) {
            if (inventarioPrueba.getCodigoInventario() == codigoInventario){
                inventarioPrueba.setStock(nuevoStock);
                break;
            }
        }
    }

    /**
     * Metodo para retornar una cadena de texto
     * @return Cadena de texto con informacion de la tienda
     */
    public String toString() {
        return "Tienda [nombre=" + nombre + ", listaInventarios=" + listaInventarios + ", listaProveedores="
                + listaProveedores + "]";
    }
}