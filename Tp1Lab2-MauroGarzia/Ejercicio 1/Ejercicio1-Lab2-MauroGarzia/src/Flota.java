public class Flota {
    private int cantidad;
    private Avion avion;

    //Constructor
    public Flota(){}

    public Flota(int cantidad, Avion avion) {
        this.cantidad = cantidad;
        this.avion = avion;
    }

    //Getter

    public int getFlota() {
        return cantidad;
    }

    public Avion getAvion() {
        return avion;
    }
    //Setter

    public void setFlota(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
}
