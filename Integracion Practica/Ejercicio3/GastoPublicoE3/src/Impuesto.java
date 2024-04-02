public class Impuesto {
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;
    private double imp5;

    //Constructor
    public Impuesto(double imp1, double imp2, double imp3, double imp4, double imp5) {
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
    }

    //Getter

    public double getImp1() {
        return imp1;
    }

    public double getImp2() {
        return imp2;
    }

    public double getImp3() {
        return imp3;
    }

    public double getImp4() {
        return imp4;
    }

    public double getImp5() {
        return imp5;
    }

    //Setter

    public void setImp1(double imp1) {
        this.imp1 = imp1;
    }

    public void setImp2(double imp2) {
        this.imp2 = imp2;
    }

    public void setImp3(double imp3) {
        this.imp3 = imp3;
    }

    public void setImp4(double imp4) {
        this.imp4 = imp4;
    }

    public void setImp5(double imp5) {
        this.imp5 = imp5;
    }

    //Metodo que calcula la cantidad recaudada
    public double calcularCantidadRecaudada(){
        double suma;
        suma = imp1 + imp2 + imp3 + imp4 + imp5;
        return suma;
    }
}
