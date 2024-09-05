public class Proveedor {
    private String nombreProveedor;
    private int idProveedor;
    private String direccion;
    private String telefono;

    /**
     * Metodo constructor de la clase Proveedor
     * @param nombreProveedor Nombre de el proveedor a crear
     * @param idProveedor Id del proveedor a crear
     * @param direccion Direccion del proveedor a crear
     * @param telefono Telefono del proveedor a crear
     */
    public Proveedor(String nombreProveedor, int idProveedor, String direccion, String telefono) {
        this.nombreProveedor = nombreProveedor;
        this.idProveedor = idProveedor;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * Metodo para modificar el nombre del proveedor
     * @param nombreProveedor Nuevo nombre
     */
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
    /**
     * Metodo para modificar el id del proveedor
     * @param idProveedor Nueva id del proveedor
     */
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    /**
     * Metodo para modificar la direccion del proveedor
     * @param direccion Nueva direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Metodo para modificar el telefono del proveedor
     * @param telefono Nuevo telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Metodo para obtener el nombre del proveedor
     * @return Nombre del proveedor
     */
    public String getNombreProveedor() {
        return nombreProveedor;
    }
    /**
     * Metodo para obtener el id del proveedor
     * @return Id del proveedor
     */
    public int getIdProveedor() {
        return idProveedor;
    }
    /**
     * Metodo para obtener la direccion del proveedor
     * @return Direccion del proveedor
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Metodo para obtener el telefono del proveedor
     * @return Telefono del proveedor
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo para retornar una cadena de texto
     * @return Cadena de texto con informacion del proveedor
     */
    public String toString() {
        return "Proveedor [nombreProveedor=" + nombreProveedor + ", idProveedor=" + idProveedor + ", direccion="
                + direccion + ", telefono=" + telefono + "]";
    }
}