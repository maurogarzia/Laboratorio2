package PolimorfismoPorSobrecarga;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.sum();
        calculadora.sum(3,4);
        calculadora.sum(3,4,5);

        }
    }

