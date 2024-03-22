public abstract class Persona {
    protected int edad;
    protected String nombre;

    //Constructor

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    //Getter

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
    //Setter

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
