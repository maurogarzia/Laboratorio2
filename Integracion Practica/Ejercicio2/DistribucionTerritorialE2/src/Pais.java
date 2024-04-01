import java.util.ArrayList;

public class Pais {
    private Provincia capital;
    private String nombre;
    private int poblacion;
    private ArrayList<Provincia> provincias;

    //Constructor

    public Pais(Provincia capital, String nombre, int poblacion, ArrayList<Provincia> provincias) {
        this.capital = capital;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.provincias = provincias;
    }

    //Getter

    public Provincia getCapital() {
        return capital;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    //Setter

    public void setCapital(Provincia capital) {
        this.capital = capital;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

    public void mostrarInfo(){
        System.out.println("---PAIS---");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Poblacion: " + getPoblacion() + " personas");
        System.out.println("Capital: " + capital.getNombre());
        System.out.print("Provincias que lo componen: ");
        mostrarProvincias(provincias);


    }

    public void mostrarProvincias(ArrayList<Provincia> provincias){
        int totalProvincias = provincias.size();
        int contador = 0;
        for (Provincia provincia : provincias){
            contador++;
            System.out.print(provincia.getNombre());
            if (contador < totalProvincias){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
    }
}
