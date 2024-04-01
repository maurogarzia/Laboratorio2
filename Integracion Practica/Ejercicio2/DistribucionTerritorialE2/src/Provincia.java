import java.util.ArrayList;
public class Provincia {
    private Ciudad capitalProvincia;
    private ArrayList<Ciudad> ciudades;
    private String nombre;
    private int poblacion;

    //Constructor

    public Provincia(Ciudad capitalProvincia, ArrayList<Ciudad> ciudades, String nombre, int poblacion) {
        this.capitalProvincia = capitalProvincia;
        this.ciudades = ciudades;
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    //Getter

    public Ciudad getCapitalProvincia() {
        return capitalProvincia;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    //Setter

    public void setCapitalProvincia(Ciudad capitalProvincia) {
        this.capitalProvincia = capitalProvincia;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    //Metodo para mostrar informacion
    public void mostrarInfo(){
        System.out.println("---PROVINCIA---");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Poblacion: " + getPoblacion() + " personas");
        System.out.println("Capital: " + capitalProvincia.getNombre());
        System.out.print("Las Ciudades que la componen son: ");
        mostrarCiudades(ciudades);

    }

    public void mostrarCiudades(ArrayList<Ciudad> ciudades){
        int totalCiudades = ciudades.size();
        int contador = 0;

        for (Ciudad ciudad : ciudades){
            contador++;
            System.out.print(ciudad.getNombre());
            if (contador < totalCiudades){
                System.out.print(", ");
            }
        }
        System.out.println(" ");

    }
}
