package Ejercicio4;

import java.util.ArrayList;


public class Almacen  {
    private ArrayList<? super Producto> productos;

    public Almacen() {
    }

    public ArrayList<? super Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<? super Producto> productos) {
        this.productos = productos;
    }

    //Metodo para agregar un producto
    public void addProducto(Producto producto) {
        productos.add(producto);

    }

    //Metodo para imprimir productos
    public void imprimirProductos(){
        for (Object producto : productos){
            if (producto instanceof  Producto){
                Producto p = (Producto) producto;
                System.out.println("Nombre: " + p.getNombre() + " Precio: $" + p.getPrecio());
            }
        }
    }
}
