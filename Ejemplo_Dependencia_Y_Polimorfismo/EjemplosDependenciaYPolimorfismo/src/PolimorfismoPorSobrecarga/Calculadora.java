package PolimorfismoPorSobrecarga;

public class Calculadora {
    void sum(){
        System.out.println("No hay parametros");
    }

    void sum(int n1){
        System.out.println("El numero es: " + n1);
    }

    void sum(int n1, int n2){
        System.out.println("La suma es: " +  (n1 + n2));
    }

    void sum(int n1 ,int n2, int n3){
        System.out.println("Con 3 parametros es resta: " + (n1 - n2 - n3));
    }
}
