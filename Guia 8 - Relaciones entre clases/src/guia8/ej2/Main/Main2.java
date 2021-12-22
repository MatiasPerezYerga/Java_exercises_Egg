package guia8.ej2.Main;

import guia8.ej2.entidades.Juego;
import guia8.ej2.entidades.Jugador;
import guia8.ej2.entidades.Revolver;
import guia8.ej2.entidades.Bala;
import java.util.Scanner;
import java.util.ArrayList;
import guia8.ej2.servicios.ServiciosRevolver;
import guia8.ej2.servicios.ServiciosJuego;

public class Main2 {

    public static void main(String[] args) {

        ServiciosJuego serviceGame = new ServiciosJuego();
        Scanner leer = new Scanner(System.in);
        Juego game = serviceGame.crearJuego();
        int resp = 1;

           serviceGame.ronda(game);
            System.out.println(game);

    }

}
