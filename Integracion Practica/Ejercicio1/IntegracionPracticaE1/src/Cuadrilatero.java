import java.util.ArrayList;

public abstract class Cuadrilatero extends Poligono{

    protected double base;
    protected double altura;
    //Constructor

    public Cuadrilatero(ArrayList<Lado> cantLados, double base, double altura) {
        super(cantLados);
        this.base = base;
        this.altura = altura;
    }

    //Metodo para calcular el perimetro
    @Override
    public abstract double calcularPerimetro();

    //Metodo para calcular el area
    @Override
    public abstract double calcularArea();

    @Override
    public void info() {

    }
}
