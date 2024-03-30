import java.util.ArrayList;

public class Rectangulo extends Cuadrilatero{

    public Rectangulo(ArrayList<Lado> cantLados, double base, double altura) {
        super(cantLados, base, altura);
    }

    //Metodo para calcular el perimetro
    @Override
    public double calcularPerimetro() {
        double perimetro = 0;
        for(Lado lado : cantLados){
            perimetro += lado.getLongitud();
        }
        return perimetro;
    }

    //Metodo para calcular el area
    @Override
    public double calcularArea() {

        return base * altura;
    }
    //Metodo que muestra la info del rectangulo
    @Override
    public void info(){
        System.out.println("Cuadrilatero Rectangulo");
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());
    }
}

