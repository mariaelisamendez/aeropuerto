/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elina
 */
public class Aeropuerto {

    Reservas reservas=new Reservas();

    GestorCheckin gestorCheckin = new GestorCheckin();

    public void hacerReserva(String codigoReserva, String nombrePasajero, String dniPasajero) {
        reservas.hacerReserva(codigoReserva, nombrePasajero, dniPasajero);
    }

    public void verDatosReservas() {
        reservas.verDatosReservas();
    }

    public String informacionCheckin(String codReserva) {
        String aerolinea;
        Reserva reservacion = reservas.obtenerReserva(codReserva);
        aerolinea = reservacion.verAerolinea();
        //System.out.println("La Reserva " + codReserva + " es de la aerolinea " + aerolinea);          
        return aerolinea;
    }

    public void hacerCheckin(String codReserva, String aerolinea) {
        switch (aerolinea) {
            case "Aerolineas Argentinas":
                gestorCheckin.esperarCheckinA1(codReserva);
                break;
            case "Latam":
                gestorCheckin.esperarCheckinA2(codReserva);
                break;
            case "JetSmart":
                gestorCheckin.esperarCheckinA3(codReserva);
                break;
        }
    }

    public void irATerminal(String codReserva) {

    }
}
