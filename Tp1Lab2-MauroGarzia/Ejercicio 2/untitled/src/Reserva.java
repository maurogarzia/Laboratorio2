import java.util.ArrayList;
public class Reserva {
    private ArrayList<String> listaReserva;
    //Constructor

    public Reserva() {
        this.listaReserva = new ArrayList<>();
    }

    //Getter

    public ArrayList<String> getListaReserva() {
        return listaReserva;
    }
    //Setter


    public void setListaReserva(ArrayList<String> listaReserva) {
        this.listaReserva = listaReserva;
    }

    //Metodos
    public void adherirReserva(String horario){
        this.listaReserva.add(horario);
    }

    public void mostrarReserva(){
        System.out.println("Reservas del vuelo del avion: " + getListaReserva());
    }
}
