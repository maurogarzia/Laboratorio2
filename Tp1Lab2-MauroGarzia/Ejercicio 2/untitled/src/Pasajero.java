public class Pasajero extends Persona{
    private int nroPasajero;
    //Constructor

    public Pasajero(int edad, String nombre, int nroPasajero) {
        super(edad, nombre);
        this.nroPasajero = nroPasajero;
    }
    //Getter

    public int getNroPasajero() {
        return nroPasajero;
    }
    //Setter

    public void setNroPasajero(int nroPasajero) {
        this.nroPasajero = nroPasajero;
    }
}
