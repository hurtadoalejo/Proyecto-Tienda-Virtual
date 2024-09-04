import java.util.Collection;
import java.util.LinkedList;

public class Tienda {
    private String nombre;
    private Collection<Inventario> listaInventarios;

    public Tienda(String nombre) {
        this.nombre = nombre;
        listaInventarios = new LinkedList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setInventario(Collection<Inventario> inventario) {
        this.listaInventarios = inventario;
    }

    public String getNombre() {
        return nombre;
    }
    public Collection<Inventario> getInventario() {
        return listaInventarios;
    }

    public void agregarInventario(Inventario inventario) {
        if (verificarInventario(inventario.getCodigoInventario())){
            listaInventarios.add(inventario);
        }
    }
    
    public boolean verificarInventario(int codigoInventario) {
        boolean centinela = true;
        for (Inventario inventarioPrueba : listaInventarios) {
            if (inventarioPrueba.getCodigoInventario() == codigoInventario){
                centinela = false;
            }
        }
        return centinela;
    }

    public void eliminarInventario(int codigoInventario) {
        for (Inventario inventarioPrueba : listaInventarios) {
            if (inventarioPrueba.getCodigoInventario() == codigoInventario){
                listaInventarios.remove(inventarioPrueba);
                break;
            }
        }
    }

    public void actualizarStock(int codigoInventario, int nuevoStock){
        for (Inventario inventarioPrueba : listaInventarios) {
            if (inventarioPrueba.getCodigoInventario() == codigoInventario){
                inventarioPrueba.setStock(nuevoStock);
                break;
            }
        }
    }

    public String toString() {
        return "Tienda [nombre=" + nombre + ", listaInventarios=" + listaInventarios + "]";
    }  
}