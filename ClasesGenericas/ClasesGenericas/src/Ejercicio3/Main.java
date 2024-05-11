package Ejercicio3;

import Ejercicio4.Almacen;
import Ejercicio4.Producto;

public class Main {
    public static void main(String[] args) {
        Ejercicio4.Almacen almacen = new Almacen();

        // Agregar algunos productos
        almacen.addProducto(new Ejercicio4.Producto("Manzana", 1.5));
        almacen.addProducto(new Ejercicio4.Producto("Televisor", 500.0));
        almacen.addProducto(new Producto("Libro", 20.0));

        // Imprimir los productos almacenados
        almacen.imprimirProductos();
    }
}
