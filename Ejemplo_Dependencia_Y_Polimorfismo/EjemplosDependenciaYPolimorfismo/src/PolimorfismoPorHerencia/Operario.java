package PolimorfismoPorHerencia;

public class Operario extends Tarbajador{
    private String sector;

    public Operario(String nombre, int edad, double sueldo, String sector) {
        super(nombre, edad, sueldo);
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    void trabajar() {
        System.out.println("El operario trabaja");;
    }
}
