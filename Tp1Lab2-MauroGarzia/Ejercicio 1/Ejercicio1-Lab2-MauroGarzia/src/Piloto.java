public class Piloto extends Persona implements Volador {
    private int nroPiloto;

    //Constructor

    public Piloto() {
    }

    public Piloto(int nroPiloto) {
        this.nroPiloto = nroPiloto;
    }

    public Piloto(int dni, int edad, String nombre, int nroPiloto) {
        super(dni, edad, nombre);
        this.nroPiloto = nroPiloto;
    }

    //Getter

    public int getNroPiloto() {
        return nroPiloto;
    }

    //Setter

    public void setNroPiloto(int nroPiloto) {
        this.nroPiloto = nroPiloto;
    }

    //Metodo
    @Override
    public void volar() {

    }

}