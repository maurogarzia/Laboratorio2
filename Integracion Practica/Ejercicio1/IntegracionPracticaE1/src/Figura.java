public abstract class Figura {
    private String color;
    private Elipse elipse;
    private Poligono poligono;

    //Constructor


    public Figura(String color, Elipse elipse, Poligono poligono) {
        this.color = color;
        this.elipse = elipse;
        this.poligono = poligono;
    }

    //Getter
    public String getColor() {
        return color;
    }

    public Elipse getElipse() {
        return elipse;
    }

    public Poligono getPoligono() {
        return poligono;
    }

    //Setter
    public void setColor(String color) {
        this.color = color;
    }

    public void setElipse(Elipse elipse) {
        this.elipse = elipse;
    }

    public void setPoligono(Poligono poligono) {
        this.poligono = poligono;
    }
}
