public class Ciudad {
    private int cantHabitantes;
    private Impuesto cantRecaudada;
    private double gastos;
    private String nombre;

    //Constructor

    public Ciudad(int cantHabitantes, Impuesto cantRecaudada, double gastos, String nombre) {
        this.cantHabitantes = cantHabitantes;
        this.cantRecaudada = cantRecaudada;
        this.gastos = gastos;
        this.nombre = nombre;
    }

    //Getter

    public int getCantHabitantes() {
        return cantHabitantes;
    }

    public Impuesto getCantRecaudada() {
        return cantRecaudada;
    }

    public double getGastos() {
        return gastos;
    }

    public String getNombre() {
        return nombre;
    }
    //Setter

    public void setCantHabitantes(int cantHabitantes) {
        this.cantHabitantes = cantHabitantes;
    }

    public void setCantRecaudada(Impuesto cantRecaudada) {
        this.cantRecaudada = cantRecaudada;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo que saca el calculo fiscal
    public double calculoFiscal(){

        double recaudo = (double) cantRecaudada.calcularCantidadRecaudada() - this.getGastos();
        System.out.println("Saldo final de la ciudad de " + this.getNombre() + ": " + recaudo);

        return recaudo;
    }

    //Metodo para saber si la ciudad esta en deficit
    public boolean estaEnDeficit(){
        double cantidad = calculoFiscal();
        if (cantidad < 0){
            return true;
        }else return false;
    }
}
