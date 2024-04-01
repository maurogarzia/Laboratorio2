public class Ciudad {
    private String nombre;
    private int poblacion;

    //Constructor

    public Ciudad(String nombre, int poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    //Getter

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    //Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    //Metodo para mostrar informacion
    public void mostrarInfo(){
        System.out.println("---CIUDAD---");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Poblacion: " + getPoblacion() + " personas");

    }
}


