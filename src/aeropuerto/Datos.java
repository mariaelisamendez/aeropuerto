/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class Datos {

    int cantPasajeros;
    String[] nombrePasajeros;
    String[] dniPasajeros;
    String[] codigosReservas;

//    String nombres = "/home/informatica/NetBeansProjects/Aeropuerto/Aeropuerto/src/main/java/Aeropuerto/nombres.txt";
//    String dnis = "/home/informatica/NetBeansProjects/Aeropuerto/Aeropuerto/src/main/java/Aeropuerto/dni.txt";
//    String codigos = "/home/informatica/NetBeansProjects/Aeropuerto/Aeropuerto/src/main/java/Aeropuerto/codigos.txt";
    String nombres = "C:\\Users\\elina\\Documents\\NetBeansProjects\\Aeropuerto\\src\\aeropuerto\\nombres.txt";
    String dnis = "C:\\Users\\elina\\Documents\\NetBeansProjects\\Aeropuerto\\src\\aeropuerto\\dni.txt";
    String codigos = "C:\\Users\\elina\\Documents\\NetBeansProjects\\Aeropuerto\\src\\aeropuerto\\codigos.txt";
    

    @SuppressWarnings("empty-statement")
    public Datos(int cantP) {
        this.cantPasajeros = cantP;
        this.nombrePasajeros = new String[this.cantPasajeros];
        this.dniPasajeros = new String[this.cantPasajeros];
        this.codigosReservas = new String[this.cantPasajeros];
        int i = 0;
        String codigoReserva = "";
        File codigosR = new File(codigos);
        Scanner objCR = null;
        try {
            objCR = new Scanner(codigosR);
            while (objCR.hasNextLine()) {
                codigoReserva = objCR.nextLine();
                codigosReservas[i] = codigoReserva;
                i++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            objCR.close();
        }
        i = 0;
        String nombrePasajero = "";
        File nombresP = new File(nombres);
        Scanner objNP = null;
        try {
            objNP = new Scanner(nombresP);
            while (objNP.hasNextLine()) {
                nombrePasajero = objNP.nextLine();
                nombrePasajeros[i] = nombrePasajero;
                i++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            objNP.close();
        }
        i = 0;
        String dniPasajero = "";
        File dniP = new File(dnis);
        Scanner objDNI = null;
        try {
            objDNI = new Scanner(dniP);
            while (objDNI.hasNextLine()) {
                dniPasajero = objDNI.nextLine();
                dniPasajeros[i] = dniPasajero;
                i++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            objDNI.close();
        }
    }

    public String nombre(int i) {
        return nombrePasajeros[i];
    }

    public String dni(int i) {
        return dniPasajeros[i];
    }

    public String codigoReserva(int i) {
        return codigosReservas[i];
    }
}