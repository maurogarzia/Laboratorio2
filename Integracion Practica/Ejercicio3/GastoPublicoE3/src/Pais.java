import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Provincia>provincias;

    //Constructor

    public Pais(String nombre, ArrayList<Provincia> provincias) {
        this.nombre = nombre;
        this.provincias = provincias;
    }

    //Getter

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }
    //Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }
}
