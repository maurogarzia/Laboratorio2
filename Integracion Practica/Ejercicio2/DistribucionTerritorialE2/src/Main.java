import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Creo intancias de ciudad
        Ciudad c1 = new Ciudad("Pueblo Paleta", 500000);
        Ciudad c2 = new Ciudad("Nueva Chicago", 130000);
        Ciudad c3 = new Ciudad("Maipu", 300000);

        //Creo ArrayList de ciudades
        ArrayList<Ciudad>ciudades = new ArrayList<>();
        ciudades.add(c1);
        ciudades.add(c2);
        ciudades.add(c3);

        //Creo intancias de provincia
        Provincia p1 = new Provincia(c3,ciudades,"Mendoza", 3000000  );
        Provincia p2 = new Provincia(c2,ciudades,"Rioja", 1000000);
        Provincia p3 = new Provincia(c1,ciudades,"Buenos Aires", 6000000);

        //Creo ArrayList de ciudades
        ArrayList<Provincia>provincias = new ArrayList<>();
        provincias.add(p1);
        provincias.add(p2);
        provincias.add(p3);

        //Creo intancias de Pais
        Pais pais = new Pais(p1, "Argentina", 45000000, provincias);

        //Creo ArrayList de Paises
        ArrayList<Pais>paises = new ArrayList<>();
        paises.add(pais);

        //Creo instancia de Continente
        Continente continente = new Continente("America", 1000000000,paises);

        continente.mostrarInfo();
        System.out.println(" ");
        pais.mostrarInfo();
        System.out.println(" ");
        p1.mostrarInfo();
        System.out.println(" ");
        c1.mostrarInfo();
    }
}