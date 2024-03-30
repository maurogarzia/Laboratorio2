public class Lado {
  private Punto puntoInicial;
  private Punto puntoFinal;
  protected double longitud;

  //Constructor

    public Lado(Punto puntoInicial, Punto puntoFinal, double longitud) {
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
        this.longitud = longitud;
    }

    //Getter
    public Punto getPuntoInicial() {
        return puntoInicial;
    }

    public Punto getPuntoFinal() {
        return puntoFinal;
    }

    public double getLongitud() {
        return longitud;
    }

    //Setter
    public void setPuntoInicial(Punto puntoInicial) {
        this.puntoInicial = puntoInicial;
    }

    public void setPuntoFinal(Punto puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
