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
    boolean asientos[][];
    int filas = 20;
    int columnas = 4;

    public Vuelo(String codReserva, int vuelo) {
        asientos = new boolean[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                asientos[i][j] = false;
            }
        }
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
    }

    public String aerolinea() {
        return this.aerolinea;
    }

    public void hacerCheckin() {
        Random r = new Random();
        int seccion = r.nextInt(2) + 1; //1 primera clase, 2 clase turista
        if (seccion == 1) {
            if (asientoDisponible(asientos, 0, 3)) {
                asignaAsiento(asientos, 0, 3);
            } else {
                asignaAsiento(asientos, 3, filas);
            }
        } else if (seccion == 2) {
            if (asientoDisponible(asientos, 3, filas)) {
                asignaAsiento(asientos, 3, filas);
            }
        }
    }

    private boolean asientoDisponible(boolean[][] arreglo, int minf, int maxf) {
        for (int i = minf; i < maxf; i++) {
            for (int j = 0; j < columnas; j++) {
                if (arreglo[i][j] == false) {
                    return true;
                }
            }
        }
        return false;
    }

    private void asignaAsiento(boolean[][] arreglo, int minf, int maxf) {
        for (int i = minf; i < maxf; i++) {
            for (int j = 0; j < columnas; j++) {
                if (arreglo[i][j] == false) {
                    arreglo[i][j] = true;
                }
            }
        }

    }
}
