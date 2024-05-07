package PolimorfismoPorParametro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto(4,"Rojo");
        Auto a2 = new Auto(4,"Rojo");
        Auto a3 = new Auto(4,"Rojo");

        ArrayList<Auto>autos = new ArrayList<>();
        autos.add(a1);
        autos.add(a2);
        autos.add(a3);
    }
}
