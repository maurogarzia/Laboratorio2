package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();

        System.out.println("Suma: " + c1.sumar(5, 3));
        System.out.println("Resta: " + c1.restar(5, 3));
        System.out.println("Multiplicacion: " + c1.multiplicar(5, 3));
        try {
            System.out.println("División: " + c1.dividir(5, 3));
        } catch (ArithmeticException e) {
            System.out.println("Hubo un error en la division");
        }
    }
}
