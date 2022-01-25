/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.util.HashMap;

/**
 *
 * @author informatica
 */
public class Reservas {

    HashMap<String, Reserva> reservas;

    public Reservas() {
        reservas = new HashMap<>();
    }

    public synchronized void hacerReserva(String codigoReserva, String nombrePasajero, String dniPasajero) {
        Reserva reserva = new Reserva(codigoReserva, nombrePasajero, dniPasajero);
        reservas.put(codigoReserva, reserva);
    }

    public synchronized void verDatosReservas() {
        reservas.keySet().forEach((String i) -> {
            System.out.println("------------Datos de la Reserva " + i + " ------------");
            reservas.get(i).verReserva();
        });
    }

    public synchronized Reserva obtenerReserva(String codReserva) {  
        return reservas.get(codReserva);
    }

    public synchronized String nombrePasajero(String codReserva) {  
        return reservas.get(codReserva).nombrePasajero;
    }
}//class Reservas
