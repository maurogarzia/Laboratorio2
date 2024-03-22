public class Main {
    public static void main(String[] args) {
        Piloto p1 = new Piloto(32, "Mauro", 334);
        Piloto p2 = new Piloto(45,"Andres",184);
        Reserva r1 = new Reserva();
        r1.adherirReserva("Martes 21:00");//Agrego lista de reserva
        r1.adherirReserva("Miercoles 6:00");
        Avion a1 = new Avion(50,184,r1,p1);
        Avion a2 = new Avion(50,332,r1,p2);
        Aeropuerto aero = new Aeropuerto("Mendoza","Labarrida", 48, "Argentina");

        //Muestro info del aeropuerto
        aero.infoAeropuerto();

        System.out.println("");

        //Muestro info del avion
        a1.infoAvion();
        a2.infoAvion();

    }
}