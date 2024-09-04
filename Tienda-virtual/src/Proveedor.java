public class Proveedor {
    private String nombreProveedor;
    private int idProveedor;
    private String direccion;
    private String telefono;

    public Proveedor(String nombreProveedor, int idProveedor, String direccion, String telefono) {
        this.nombreProveedor = nombreProveedor;
        this.idProveedor = idProveedor;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }
    public int getIdProveedor() {
        return idProveedor;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getTelefono() {
        return telefono;
    }

    public String toString() {
        return "Proveedor [nombreProveedor=" + nombreProveedor + ", idProveedor=" + idProveedor + ", direccion="
                + direccion + ", telefono=" + telefono + "]";
    }
}