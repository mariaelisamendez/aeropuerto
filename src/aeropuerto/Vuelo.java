package aeropuerto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class Vuelo {

    String codigoReserva;
    String aerolinea;
    String nroVuelo;
    String ciudadSalida;
    String fechaSalida;
    String horaSalida;
    String ciudadArribo;
    String fechaArribo;
    String horaArribo;
    String asiento;
    boolean checkin;

    
    public Vuelo(String codReserva, int vuelo) {
        switch (vuelo) {
            case 1:
                this.codigoReserva = codReserva;
                this.aerolinea = "JetSmart";
                this.nroVuelo = "5998";
                this.ciudadSalida = "Neuquen";
                this.fechaSalida = "12/03/22";
                this.horaSalida = "09:00:00";
                this.ciudadArribo = "Cordoba";
                this.fechaArribo = "12/03/22";
                this.horaArribo = "10:45:00";
                this.asiento = "";
                this.checkin = false;
                break;
            case 2:
                this.codigoReserva = codReserva;
                this.aerolinea = "Latam";
                this.nroVuelo = "2269";
                this.ciudadSalida = "Neuquen";
                this.fechaSalida = "12/03/22";
                this.horaSalida = "10:00:00";
                this.ciudadArribo = "Buenos Aires";
                this.fechaArribo = "12/03/22";
                this.horaArribo = "11:50:00";
                this.asiento = "";
                this.checkin = false;
                break;
            case 3:
                this.codigoReserva = codReserva;
                this.aerolinea = "Aerolineas Argentinas";
                this.nroVuelo = "8496";
                this.ciudadSalida = "Neuquen";
                this.fechaSalida = "12/03/22";
                this.horaSalida = "11:00:00";
                this.ciudadArribo = "Buenos Aires";
                this.fechaArribo = "12/03/22";
                this.horaArribo = "12:45:00";
                this.asiento = "";
                this.checkin = false;
                break;
        }
    }

    public void verVuelo() {
        System.out.println("Datos del Vuelo");
        System.out.println("codigo reserva: " + this.codigoReserva);
        System.out.println("aerolinea: " + this.aerolinea);
        System.out.println("nroVuelo: " + this.nroVuelo);
        System.out.println("ciudad Salida: " + this.ciudadSalida);
        System.out.println("fecha Salida: " + this.fechaSalida);
        System.out.println("hora Salida: " + this.horaSalida);
        System.out.println("ciudad Arribo: " + this.ciudadArribo);
        System.out.println("fecha Arribo: " + this.fechaArribo);
        System.out.println("horaArribo: " + this.horaArribo);
        System.out.println("asiento: " + this.asiento);
        System.out.println("checkin: " + this.checkin);
    }

     public String aerolinea() {
         return this.aerolinea;
     }
     
     
    public void hacerCheckin() {
        this.checkin = true;
        this.asiento = "";
    }

}