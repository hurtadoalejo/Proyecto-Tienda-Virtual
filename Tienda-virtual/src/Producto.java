public class Producto {
    private String nombreProducto;
    private int idProducto;
    private String talla;
    private String descripcion;

    public Producto(String nombreProducto, int idProducto, String talla, String descripcion) {
        this.nombreProducto = nombreProducto;
        this.idProducto = idProducto;
        this.talla = talla;
        this.descripcion = descripcion;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }
    public int getIdProducto() {
        return idProducto;
    }
    public String getTalla() {
        return talla;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public String toString() {
        return "Producto [nombreProducto=" + nombreProducto + ", idProducto=" + idProducto + ", talla=" + talla
                + ", descripcion=" + descripcion + "]";
    } 
}