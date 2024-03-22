import java.util.ArrayList;
public class Reserva {
    private String horario;
    private ArrayList<String> listaReserva = new ArrayList<>();
    //Constructor
    public Reserva() {
    }
    public Reserva(String horario, ArrayList<String> listaReserva) {
        this.horario = horario;
        this.listaReserva = listaReserva;
    }
    //Getter
    public String getHorario() {
        return horario;
    }
    public ArrayList<String> getListaReserva() {
        return listaReserva;
    }
    //Setter
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setListaReserva(ArrayList<String> listaReserva) {
        this.listaReserva = listaReserva;
    }

    //Metodo
    public void addReserva(String horario){
        this.listaReserva.add(horario);
    }
    public void mostrarReserva(){
        System.out.println("Las reservas del vuelo son: " + getListaReserva());
    }
}
