package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        // Agregar algunos productos
        almacen.addProducto(new Producto("Manzana", 1.5));
        almacen.addProducto(new Producto("Televisor", 500.0));
        almacen.addProducto(new Producto("Libro", 20.0));

        // Imprimir los productos almacenados
        almacen.imprimirProductos();
    }
}
