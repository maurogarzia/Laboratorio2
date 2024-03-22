
public class Aeropuerto {
    private String ciudad;
    private String nombre;
    private int nroAeropuerto;
    private String pais;


    //Constructor

    public Aeropuerto(String ciudad, String nombre, int nroAeropuerto, String pais) {
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.nroAeropuerto = nroAeropuerto;
        this.pais = pais;

    }


    //Getter

    public String getCiudad() {
        return ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroAeropuerto() {
        return nroAeropuerto;
    }

    public String getPais() {
        return pais;
    }

    //Setter

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNroAeropuerto(int nroAeropuerto) {
        this.nroAeropuerto = nroAeropuerto;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    //Metodos



    public void infoAeropuerto(){
        System.out.println("---INFORMACION DEL AEROPUERTO---");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nro: " + getNroAeropuerto());
        System.out.println("Pais: " + getPais());
        System.out.println("Ciudad: " + getCiudad());
    }




}
