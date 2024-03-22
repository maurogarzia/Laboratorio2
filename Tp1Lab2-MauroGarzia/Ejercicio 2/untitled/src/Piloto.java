public class Piloto extends Persona implements Volador{
    private int nroPiloto;

    public Piloto(int edad, String nombre, int nroPiloto) {
        super(edad, nombre);
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

    @Override
    public void volar() {
        System.out.println("El piloto esta volando el avion");
    }

    @Override
    public String toString(){
        return getNombre();
    }
}
