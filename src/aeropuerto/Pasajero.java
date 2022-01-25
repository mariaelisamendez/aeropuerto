/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

/**
 *
 * @author informatica
 */
public class Pasajero implements Runnable {

    String nombrePasajero;
    String dniPasajero;
    String codigoReserva;
    Aeropuerto aeropuerto;

    public Pasajero(String n, String dni, String cr, Aeropuerto a) {
        this.nombrePasajero = n;
        this.dniPasajero = dni;
        this.codigoReserva = cr;
        this.aeropuerto = a;
    }

    @Override
    public void run() {
        aeropuerto.hacerReserva(codigoReserva, nombrePasajero, dniPasajero);
        System.out.println("el pasajero " + nombrePasajero + " quiere hacer el checkin con la reserva " + codigoReserva);
        String puestoAerolinea = aeropuerto.informacionCheckin(codigoReserva);
        System.out.println("el pasajero " + nombrePasajero + " tiene que ir al puesto de Checkin de " + puestoAerolinea);
        //aeropuerto.hacerCheckin(codigoReserva, puestoAerolinea);
        //aeropuerto.irATerminal(codigoReserva);
    }
}
