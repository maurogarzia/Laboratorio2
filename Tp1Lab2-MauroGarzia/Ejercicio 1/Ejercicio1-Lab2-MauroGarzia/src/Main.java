public class Main {
    public static void main(String[] args) {
        Piloto piloto = new Piloto(44905166, 21, "Mauro Garzia", 3385);
        Avion avion = new Avion(45,"A2567B3");
        Reserva reserva = new Reserva();

        reserva.addReserva("Martes 21:00");//Agrego otra reserva a la lista
        reserva.addReserva("Jueves 9:00");//Agrego otra reserva a la lista

        Vuelo vuelo = new Vuelo(15, reserva);
        Flota flota = new Flota(2,avion);






    }
}