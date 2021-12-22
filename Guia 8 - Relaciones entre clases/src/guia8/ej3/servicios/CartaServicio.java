package guia8.ej3.servicios;

import java.util.Scanner;
import guia8.ej3.entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CartaServicio {

    ArrayList<Carta> mazo = new ArrayList();
    ArrayList<Carta> mazoDescubierto = new ArrayList();

    public ArrayList<Carta> crearMazo() {

        String[] palos = new String[4];
        palos[0] = "Epada";
        palos[1] = "Basto";
        palos[2] = "Oro";
        palos[3] = "Copa";

        for (int j = 0; j < 4; j++) {

            for (int k = 1; k <= 12; k++) {

                if (k != 8) {

                    if (k != 9) {

                        Carta carta = new Carta();
                        carta.setPalo(palos[j]);
                        carta.setNumero(k);
                        System.out.println(carta);
                        mazo.add(carta);

                    }

                }
            }

            //System.out.println(mazo);
        }
        return mazo;
    }

    public void mostrarMazo(ArrayList<Carta> mazo) {
        System.out.println(mazo);

    }

    public ArrayList<Carta> barajarMazo(ArrayList<Carta> mazo) {
        Collections.shuffle(mazo);

        return mazo;
    }

    public ArrayList<Carta> siguienteCarta(ArrayList<Carta> mazo) {
        if (mazo.size() > 0) {
            for (Iterator<Carta> it = mazo.iterator(); it.hasNext();) {
                Carta next = it.next();
                System.out.println(next);

                mazoDescubierto.add(next);
                System.out.println("MazoDescubierto: " + mazoDescubierto);
                System.out.println("MazoDescubierto cantidad: " + mazoDescubierto.size());
                mazo.remove(next);
                break;

            }
        } else {
            System.out.println("No hay mas cartas en el mazo!");
        }
        return mazo;
    }

    public ArrayList<Carta> cartasDisponibles(ArrayList<Carta> mazo) {
        System.out.println("La cantidad de cartas disponibles es: " + mazo.size());
        return mazo;
    }

    public ArrayList<Carta> darCartas(ArrayList<Carta> mazo, int cartasPedidas) {

        if (mazo.size() >= cartasPedidas) {

            for (int i = 0; i < cartasPedidas; i++) {

                for (Iterator<Carta> it = mazo.iterator(); it.hasNext();) {
                    Carta next = it.next();
                    System.out.println(next);

                    mazoDescubierto.add(next);
                    System.out.println("MazoDescubierto: " + mazoDescubierto);
                    System.out.println("MazoDescubierto cantidad: " + mazoDescubierto.size());
                    mazo.remove(next);
                    break;
                }
            }

        }
        return mazo;
    }

    public ArrayList<Carta> cartasMonton() {
        return mazoDescubierto;
    }

    public ArrayList<Carta> mostrarBaraja(ArrayList<Carta> mazo) {

        if (mazo.size() > 0) {
            for (Iterator<Carta> iterator = mazo.iterator(); iterator.hasNext();) {
                Carta next = iterator.next();
                System.out.println(next);
            }
        } else {
            System.out.println("No quedan mas cartas perro.");
        }

        return mazo;
    }

}
