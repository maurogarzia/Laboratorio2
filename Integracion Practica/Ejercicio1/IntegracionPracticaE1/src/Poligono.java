import java.util.ArrayList;

public abstract class Poligono {
    protected ArrayList<Lado> cantLados ;

    //Constructor
    public Poligono(ArrayList<Lado> cantLados) {
        this.cantLados = cantLados;
    }

    //Metodo para calcular el perimetro
    public abstract double calcularPerimetro();

    //Metodo para calcular el area
    public abstract double calcularArea();

    //Metodo para mostrar la informacion
    public abstract void info();



}
