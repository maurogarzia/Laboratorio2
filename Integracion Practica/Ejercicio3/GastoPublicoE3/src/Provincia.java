import java.util.ArrayList;

public class Provincia {
    private ArrayList<Ciudad>ciudades;
    private String nombre;

    //Constructor

    public Provincia(ArrayList<Ciudad> ciudades, String nombre) {
        this.ciudades = ciudades;
        this.nombre = nombre;
    }
    //Getter

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public String getNombre() {
        return nombre;
    }
    //Setter

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo que almacena las ciudades en deficit
    public void ciudadesEnDeficit(){
        ArrayList<Ciudad> deficit = new ArrayList<Ciudad>();
        for (Ciudad ciudad : ciudades){
            if ((ciudad.estaEnDeficit()) && (ciudad.getCantHabitantes() > 100000)){
                deficit.add(ciudad);
            }
        }

        //Si la cantidad de las que estan en deficit es mayor a la mitad del total

        if (deficit.size() > (ciudades.size() / 2) ){
            System.out.println("Esta provincia tiene mas de la mitad de las ciudades en deficit, con un total de: "
            + deficit.size());

            System.out.println("Las cuales son: ");
            int contador = 0;
            for(Ciudad ciudad : deficit){
                contador++;
                System.out.print(ciudad.getNombre()) ;
                if (contador < deficit.size()){
                    System.out.print(", ");
                }
            }
            System.out.println(" ");
        }else {
            System.out.println("Esta provincia tiene menos de la mitad de las ciudades en deficit");
        }
    }
}
