import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Creo Objeto tipo Circulo
        /*
        Circulo redondo = new Circulo(3.44);
        redondo.calcularArea();
        redondo.CalcularDiametro();
        redondo.calcularPerimetro();

        */

        //Creo un objeto tipo Punto
        Punto punto1 = new Punto(5, 10);
        Punto punto2 = new Punto(4, 7);

        /*
        //Creo objeto tipo Lado para triangulo
        Lado lado = new Lado(punto1, punto2,4);
        Lado lado1 = new Lado(punto2, punto1,5);
        Lado lado2 = new Lado(punto1, punto1,5);


        ArrayList<Lado> arrayDeLados = new ArrayList<>(); //Creo un array de lados para incorporarlo al objeto Triangulo
        arrayDeLados.add(lado);
        arrayDeLados.add(lado1);
        arrayDeLados.add(lado2);

        //Creo un objeto de tipo Triangulo
        Triangulo t1 = new Triangulo(arrayDeLados,"Isosceles");
        t1.calcularArea();
        t1.calcularPerimetro();
        t1.info();



        //Creo objeto tipo Lado para Rectangulo
        Lado l1 = new Lado(punto1, punto2, 15);//El primer lado es opuesto con el tercero
        Lado l2 = new Lado(punto2, punto1, 10);//El segundo lado es opuesto con el ultimo
        Lado l3 = new Lado(punto2, punto2, 15);
        Lado l4 = new Lado(punto1, punto1, 10);

        ArrayList<Lado> arrayDeLados = new ArrayList<>();
        arrayDeLados.add(l1);
        arrayDeLados.add(l2);
        arrayDeLados.add(l3);
        arrayDeLados.add(l4);

        Creo un objeto de tipo Rectangulo
        Rectangulo r1 = new Rectangulo(arrayDeLados, l1.getLongitud(), l2.getLongitud());
        r1.calcularArea();
        r1.calcularPerimetro();
        r1.info();

         */
        //Creo objeto tipo lado para cuadrado
        Lado l1 = new Lado(punto1, punto2, 10);//Todos los lados deben ser iguales
        Lado l2 = new Lado(punto2, punto1, 10);
        Lado l3 = new Lado(punto2, punto2, 10);
        Lado l4 = new Lado(punto1, punto1, 10);

        ArrayList<Lado> arrayDeLados = new ArrayList<>();
        arrayDeLados.add(l1);
        arrayDeLados.add(l2);
        arrayDeLados.add(l3);
        arrayDeLados.add(l4);


        //Creo un objeto de tipo Cuadrado
        Cuadrado cuadrado = new Cuadrado(arrayDeLados, l1.getLongitud(), l2.getLongitud());
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        cuadrado.info();






    }
}