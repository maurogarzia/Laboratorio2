public class Avion {
    private int asientos;
    private String patente;
    //Constructor
    public Avion(){}
    public Avion(int asientos, String patente) {
        this.asientos = asientos;
        this.patente = patente;
    }
    //Getter
    public int getAsientos() {
        return asientos;
    }
    public String getPatente() {
        return patente;
    }
    //Setter
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
}
