/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elina
 */
public class GestorCheckin {

    private final Lock lockCheckinA1;
    private final Lock lockCheckinA2;
    private final Lock lockCheckinA3;
    private final Condition esperandoEnHall;
    private int maxPuestoCheckinA1;
    private int maxPuestoCheckinA2;
    private int maxPuestoCheckinA3;
    private int puestosOcupadosCheckinA1 = 0;
    private int puestosOcupadosCheckinA2 = 0;
    private int puestosOcupadosCheckinA3 = 0;
    Reservas reservas;

    public GestorCheckin() {
        lockCheckinA1 = new ReentrantLock(true);
        esperandoEnHall  = lockCheckinA1.newCondition();
        lockCheckinA2 = new ReentrantLock(true);
        lockCheckinA3 = new ReentrantLock(true);
    }

    public void esperarCheckinA1(String codReserva) {
        lockCheckinA1.lock();
        String nombrePasajero = reservas.nombrePasajero(codReserva);
        try {
            while (puestosOcupadosCheckinA1 >= maxPuestoCheckinA1) {
                System.out.println("El pasajero " + nombrePasajero + " tiene que esperar en el Hall");
                esperandoEnHall.await();
            }
            puestosOcupadosCheckinA1++;
            System.out.println("El pasajero " + nombrePasajero + " consigue hacer cola para el checkin");

        } catch (InterruptedException ex) {
            Logger.getLogger(GestorCheckin.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            lockCheckinA1.unlock();
        }
    }

    public void hacerCheckinA1(String codReserva) {
        lockCheckinA1.lock();
        try {

            System.out.println("El pasajero " + "" + " termina de hacer el check in y se va");
            puestosOcupadosCheckinA1--;
            esperandoEnHall.signal();
        } finally {
            lockCheckinA1.unlock();
        }
    }
    
    
    public void esperarCheckinA2(String codReserva) {

    }

    public void esperarCheckinA3(String codReserva) {

    }
}
