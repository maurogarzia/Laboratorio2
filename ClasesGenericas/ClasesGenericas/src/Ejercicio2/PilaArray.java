package Ejercicio2;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class PilaArray <E> {
    private int cantElementos;
    private ArrayList<E>elementos;
    private int contador;


    public PilaArray(int cantElementos) {
        this.cantElementos = cantElementos;
        this.elementos = new ArrayList<>();
        this.contador = 0;
    }

    //Metodo para saber si la pila esta vacia
    public boolean estaVacia(){
        if (contador == 0)
            return true;
        else return false;
    }

    //Metodo para adherir un elemento
    public boolean addElemento(E elemento){
        boolean condicion = true; //Asumo que si hay espacio libre
        if (contador <= cantElementos){
            elementos.add(elemento);
            contador ++;
        }else {
            condicion = false;
        }
        return condicion;
    }

    //Metodo que devuelve el elemento que esta en el contador
    public E primero(){
        if (estaVacia())
            throw new NoSuchElementException();
        else return elementos.get(contador);
    }

    //Metodo para extraer un elemento
    public E extraer() {
        if (estaVacia()) {
            throw new NoSuchElementException();
        }else {
            contador --;
        }
        return elementos.get(contador);
    }

    //Metodo toString

    @Override
    public String toString() {
        return super.toString();
    }
}
