public class Vuelo {
    private int nroVuelo;
    private Reserva reservas;
    //Constructor
    public Vuelo(){}
    public Vuelo(int nroVuelo, Reserva reservas) {
        this.nroVuelo = nroVuelo;
        this.reservas = reservas;
    }
    //Getter
    public int getNroVuelo() {
        return nroVuelo;
    }
    public Reserva getReservas() {
        return reservas;
    }
    //Setter
    public void setNroVuelo(int nroVuelo) {
        this.nroVuelo = nroVuelo;
    }
    public void setReservas(Reserva reservas) {
        this.reservas = reservas;
    }
}
