public class App {
    public static void main(String[] args){
        Producto productoUno = new Producto("Camisa", 1, "L", "Camiseta exótica");
        Producto productoDos = new Producto("Camiseta",2, "L", "Camiseta exótica");
        Inventario inventarioUno = new Inventario(1, Categoria.CAMISETAS, 5);
        Inventario inventarioDos = new Inventario(2, Categoria.PANTALONES, 7);
        Tienda tienda = new Tienda("Caseritos");
        inventarioUno.agregarProducto(productoUno);
        inventarioUno.agregarProducto(productoDos);
        tienda.agregarInventario(inventarioDos);
        System.out.println(tienda.toString());
    }
}
