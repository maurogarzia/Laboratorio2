package org.example.Ejercicio5;

public class DebugExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = add(a, b);
        int multi = multiply(a, b);
        System.out.println("Result: " + result);
        System.out.println("Multiplicacion : " + multi);

    }

    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int multiply(int a,int b){
        int result = a * b;
        return result;
    }
}
