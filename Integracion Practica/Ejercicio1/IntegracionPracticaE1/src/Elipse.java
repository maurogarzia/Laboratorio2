import java.lang.Math;
public abstract class Elipse {
    protected double radio;

    //Constructor

    public Elipse(double radio) {
        this.radio = radio;
    }
    //Getter

    public double getRadio() {
        return radio;
    }
    //Setter

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Metodo para calcular el Area
    public abstract void calcularArea();

    //Metodo para calcular el Diametro
    public abstract void CalcularDiametro();

    //Metodo para calcular perimetro
    public abstract void calcularPerimetro();
}
