package guia8.ej2.servicios;

import guia8.ej2.entidades.Juego;
import guia8.ej2.entidades.Jugador;
import guia8.ej2.entidades.Revolver;
import guia8.ej2.entidades.Bala;
import java.util.Scanner;
import java.util.ArrayList;
import guia8.ej2.servicios.ServiciosRevolver;

public class ServiciosJuego {

    Scanner leer = new Scanner(System.in);

    ServiciosRevolver serviceGun = new ServiciosRevolver();

    public Juego crearJuego() {

        System.out.println("Ingrese la cantidad de jugadores");
        int cantPlayers = leer.nextInt();
        while (cantPlayers > 6) {
            System.out.println("La cantidad máxima de jugadores es 6");
        }
        Juego juego = new Juego();

        // ArrayList<Jugador> jugadores = new ArrayList();
        for (int i = 1; i <= cantPlayers; i++) {
            System.out.println("Ingrese el nombre del Jugador para el id: " + i + ".");
            String nombre = leer.next();
            Jugador jugador = new Jugador(i, nombre, false);

            juego.getJugadores().add(jugador);
        }
        Revolver gun = new Revolver();

        Revolver rev1 = serviceGun.recargarGun(gun, cantPlayers);
        juego.setRevolver(rev1);
        System.out.println(juego);

        return juego;

    }

    public void ronda(Juego juego) {
        boolean finish = false;
        do {
            for (Jugador player : juego.getJugadores()) {
                System.out.println("NUEVA RONDA");
                serviceGun.shoot(juego.getRevolver(), player);
                serviceGun.siguienteBala(juego.getRevolver());
                System.out.println(player);

                if (player.isMojado()) {
                    System.out.println("EL JUEGO TERMINÓ");
                    finish = true;
                }

                if (finish) {
                    break;
                }

            }
        } while (finish = false);

    }
}
