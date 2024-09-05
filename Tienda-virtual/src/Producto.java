public class Producto {
    private String nombreProducto;
    private int idProducto;
    private String talla;
    private String descripcion;

    /**
     * Metodo constructor de la clase Producto
     * @param nombreProducto Nombre del producto a crear
     * @param idProducto Id del producto a crear
     * @param talla Talla del producto a crear
     * @param descripcion Descripcion del producto a crear
     */
    public Producto(String nombreProducto, int idProducto, String talla, String descripcion) {
        this.nombreProducto = nombreProducto;
        this.idProducto = idProducto;
        this.talla = talla;
        this.descripcion = descripcion;
    }

    /**
     * Metodo para modificar el nombre del producto
     * @param nombreProducto Nuevo nombre del producto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    /**
     * Metodo para modificar el id del producto
     * @param idProducto Nuevo id del producto
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    /**
     * Metodo para modificar la talla del producto
     * @param talla Nueva talla del producto
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }
    /**
     * Metodo para modificar la descripcion del producto
     * @param descripcion Nueva descripcion del producto
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo para obtener el nombre del producto
     * @return Nombre del producto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }
    /**
     * Metodo para obtener el id del producto
     * @return Id del producto
     */
    public int getIdProducto() {
        return idProducto;
    }
    /**
     * Metodo para obtener la talla del producto
     * @return Talla del producto
     */
    public String getTalla() {
        return talla;
    }
    /**
     * Metodo para obtener la descripcion del producto
     * @return Descripcion del producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo para retornar una cadena de texto
     * @return Cadena de texto con informacion del producto
     */
    public String toString() {
        return "Producto [nombreProducto=" + nombreProducto + ", idProducto=" + idProducto + ", talla=" + talla
                + ", descripcion=" + descripcion + "]";
    } 
}