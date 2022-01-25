/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.util.Random;

/**
 *
 * @author elina
 */
public class Reserva {

    String codReserva, nombrePasajero, dniPasajero;
    Vuelo vuelo;

    public Reserva(String codR, String nombre, String dni) {
        this.codReserva = codR;
        this.dniPasajero = dni;
        this.nombrePasajero = nombre;
        Random r = new Random();
        int opcion = r.nextInt(3) + 1;
        this.vuelo = new Vuelo(codReserva, opcion);
    }

    public void verReserva() {
        System.out.println("Datos del Pasajero");
        System.out.println("Codigo de reserva: " + codReserva);
        System.out.println("DNI del Pasajero: " + dniPasajero);
        System.out.println("Nombre del Pasajero: " + nombrePasajero);
        vuelo.verVuelo();
    }
    
    public String verAerolinea(){
        return vuelo.aerolinea();
    }
}
