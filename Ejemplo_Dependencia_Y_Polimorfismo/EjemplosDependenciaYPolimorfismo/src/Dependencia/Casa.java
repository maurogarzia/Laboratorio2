package Dependencia;

public class Casa {
    private String location;

    public Casa(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void abrirPuerta(Puerta puerta){
        System.out.println("La puerta de " + puerta.getMaterial() + " se esta abriendo");
    }


}
