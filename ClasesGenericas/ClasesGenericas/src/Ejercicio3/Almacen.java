package Ejercicio3;

import java.util.ArrayList;

public class Almacen {
    private ArrayList<? extends Producto>productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public ArrayList<? extends Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<? extends Producto> productos) {
        this.productos = productos;
    }

    //Metodo para agregar productos
    public void addProducto(Producto producto){
        productos.add(producto);
    }

    //Metodo para imprimir Producto
    public void imprimirProductos(){
        for (Producto producto : productos ){
            System.out.println("Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio());
        }
    }
}
