public class Circulo extends Elipse{

    //Constructor
    public Circulo(double radio) {
        super(radio);
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del circulo es: " + Math.pow(this.getRadio() , 2) * Math.PI );
    }

    @Override
    public void CalcularDiametro() {
        System.out.println("El diametro es: " + (this.getRadio() * 2));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del circulo es: " + (2 * Math.PI * this.getRadio()));
    }
}
