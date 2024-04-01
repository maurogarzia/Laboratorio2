import java.util.ArrayList;

public class Continente {
    private String nombre;
    private int poblacion;
    private ArrayList<Pais> paises;

    //Constructor

    public Continente(String nombre, int poblacion, ArrayList<Pais> paises) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.paises = paises;
    }

    //Getter

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    //Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }

    public void mostrarInfo(){
        System.out.println("---CONTINENTE---");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Poblacion: " + getPoblacion() + " personas");
        System.out.print("Paises que lo componen: ");
        mostrarPaises(paises);
    }

    public void mostrarPaises(ArrayList<Pais> paises){
        int totalPaises = paises.size();
        int contador = 0;
        for (Pais pais : paises){
            contador ++;
            System.out.print(pais.getNombre());
            if (contador < totalPaises){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
    }
}
