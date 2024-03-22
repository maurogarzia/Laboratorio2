public class Avion {
    private int capacidad;
    private int nroAvion;
    private Reserva reservas;
    private Piloto piloto;

    //Constructor

    public Avion(int capacidad, int nroAvion, Reserva reservas, Piloto piloto) {
        this.capacidad = capacidad;
        this.nroAvion = nroAvion;
        this.reservas = reservas;
        this.piloto = piloto;
    }
    //Getter

    public int getCapacidad() {
        return capacidad;
    }

    public int getNroAvion() {
        return nroAvion;
    }

    public Reserva getReservas() {
        return reservas;
    }

    public Piloto getPiloto() {
        return piloto;
    }
    //Setter

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setNroAvion(int nroAvion) {
        this.nroAvion = nroAvion;
    }

    public void setReservas(Reserva reservas) {
        this.reservas = reservas;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    //Metodo
    public void infoAvion(){
        System.out.println("---INFORMACION DEL AVION---");
        System.out.println("Numero de avion: " + getNroAvion());
        reservas.mostrarReserva();
        System.out.println("Piloto: " + getPiloto());
        System.out.println("Capacidad: " + getCapacidad());

    }



}
