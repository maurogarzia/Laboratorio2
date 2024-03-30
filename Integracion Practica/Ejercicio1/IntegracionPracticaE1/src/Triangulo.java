
import java.util.ArrayList;

public class Triangulo extends Poligono{

    private String tipo;

    //Constructor

    public Triangulo(ArrayList<Lado> cantLados, String tipo) {
        super(cantLados);
        this.tipo = tipo;
    }

    //Getter

    public String getTipo() {
        return tipo;
    }

    //Setter
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Metodo para calcular el perimetro
    @Override
    public double calcularPerimetro() {
        double perimetro = 0; //Variable de perimetro
        for (Lado lado : cantLados) {
            perimetro += lado.getLongitud();
        }
        return perimetro;
    }


    //Metodo para calcular el area
        @Override
        public double calcularArea () {
            double multi = 1;
            double semiPerimetro = calcularPerimetro() / 2; //Calculo el semiperimetro llamando al metodo que calcula el perimetro y lo divido por dos
            for (Lado lado : cantLados){
                multi *= semiPerimetro - lado.getLongitud(); //Semi perimetro - longitud del lado

                                                                //multi almacena y multiplica las restas
            }
            double area = Math.sqrt(multi * semiPerimetro);     //El calculo del area esta sacado con la formula de HERON.
            return area;
        }

        //Metodo para mostrar info del Triangulo
    @Override
        public void info() {
            System.out.println("Triangulo " + getTipo());
            System.out.println("Perimetro: " + calcularPerimetro());
            System.out.println("Area : " + calcularArea());
        }

}



