public abstract class Persona {
    protected int dni;
    protected int edad;
    protected String nombre;

    //Contructor
    public Persona(){}

    public Persona(int dni, int edad, String nombre) {
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
    }

    //Getter

    public int getDni() {
        return dni;
    }


    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    //Setter

    public void setDni(int dni) {
        this.dni = dni;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

