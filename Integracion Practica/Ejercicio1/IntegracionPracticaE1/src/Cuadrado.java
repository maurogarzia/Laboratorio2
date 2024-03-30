import java.util.ArrayList;

public class Cuadrado extends Rectangulo{

    public Cuadrado(ArrayList<Lado> cantLados, double base, double altura) {
        super(cantLados, base, altura);
    }

    //Metodo para calcular el perimetro
    @Override
    public double calcularPerimetro() {
        return super.calcularPerimetro();
    }

    //Metodo para calcular el area
    @Override
    public double calcularArea() {
        return super.calcularArea();
    }

    //Metodo que muestra la info del cuadrado
    @Override
    public void info() {
        System.out.println("Cuadrilatero: Cuadrado");
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());
    }
}
