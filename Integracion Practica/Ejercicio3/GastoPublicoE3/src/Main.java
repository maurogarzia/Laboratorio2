import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Creo clases Impuesto
        Impuesto i1 = new Impuesto(10000, 25000, 34657.32, 400000, 345000);
        Impuesto i2 = new Impuesto(10500, 25000, 34657.32, 400000, 345000);
        Impuesto i3 = new Impuesto(10500, 25000, 34657.32, 400000, 345000);
        Impuesto i4 = new Impuesto(10500, 25000, 34657.32, 400000, 345000);



        //Creo objetos Ciudad
        Ciudad c1 = new Ciudad(1000000, i1 , 500000, "Villa Maria");
        System.out.println(c1.estaEnDeficit());

        System.out.println(" ");
        Ciudad c2 = new Ciudad(450000,i2,7000000, "Sint Louis");
        System.out.println(c2.estaEnDeficit());
        System.out.println(" ");
        Ciudad c3 = new Ciudad(1000000, i3, 7000000, "Maipu");
        System.out.println(c3.estaEnDeficit());
        System.out.println(" ");
        Ciudad c4 = new Ciudad(1000000, i4, 7000000, "Maipu");

        //Creo Array de ciudades
        ArrayList<Ciudad>ciudades = new ArrayList<Ciudad>();
        ciudades.add(c1);
        ciudades.add(c2);
        ciudades.add(c3);
        ciudades.add(c4);

        //Creo Objeto Provincia
        Provincia p1 = new Provincia(ciudades, "Mendoza");
        p1.ciudadesEnDeficit();


    }
}