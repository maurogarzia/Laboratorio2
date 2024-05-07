package PolimorfismoPorParametro;

public class Auto {
    private int ruedas;
    private String color;

    public Auto(int ruedas, String color) {
        this.ruedas = ruedas;
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
