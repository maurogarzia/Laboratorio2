package Dependencia;

public class Main {
    public static void main(String[] args) {
        Puerta p1 = new Puerta("Madera");
        Casa c1 = new Casa("Maipu");

        c1.abrirPuerta(p1);

    }
}