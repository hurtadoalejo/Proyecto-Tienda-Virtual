public class App {
    public static void main(String[] args){
        Producto productoUno = new Producto("Pantalon", 1, "L", "Pantalon");
        Producto productoDos = new Producto("Camiseta",2, "L", "Camiseta");
        Inventario inventarioUno = new Inventario(1, Categoria.CAMISETAS, 5);
        Inventario inventarioDos = new Inventario(2, Categoria.PANTALONES, 7);
        Proveedor proveedorUno = new Proveedor("Alejandro", 2911, "Cra 4", "311444");
        Tienda tienda = new Tienda("Caseritos");
        inventarioUno.agregarProducto(productoDos);
        inventarioDos.agregarProducto(productoUno);
        tienda.agregarInventario(inventarioDos);
        tienda.agregarInventario(inventarioUno);
        tienda.agregarProveedor(proveedorUno);
        System.out.println(tienda.toString());
        tienda.actualizarStock(1, 24);
        System.out.println("\n" + inventarioUno.toString());
    }
}