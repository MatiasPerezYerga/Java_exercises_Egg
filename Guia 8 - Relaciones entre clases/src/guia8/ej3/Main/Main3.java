package guia8.ej3.Main;

import guia8.ej3.entidades.Carta;
import java.util.ArrayList;
import java.util.Scanner;
import guia8.ej3.servicios.CartaServicio;

public class Main3 {

    public static void main(String[] args) {

        CartaServicio cardService = new CartaServicio();
        Carta carta = new Carta();
        ArrayList<Carta> mazo1 = new ArrayList();
        Scanner leer = new Scanner(System.in);
        ArrayList<Carta> mazoDescubierto = new ArrayList();

        int resp = 0;
        int cartasPedidas = 0;

        while (resp != 8) {
            System.out.println("Bienvenido ");
            System.out.println("Ingrese el numero de la opcion que desea:");
            System.out.println("1.Nuevo mazo de cartas");
            System.out.println("2.Barajar el mazo");
            System.out.println("3.Siguiente carta?");
            System.out.println("4.Cuantas cartas quedan en el mazo?");
            System.out.println("5.Dar una cantidad especifica de cartas.");
            System.out.println("6.Cuales cartas ya han aparecido?");
            System.out.println("7.Mostrar baraja.");
            System.out.println("8.Salir");
            resp = leer.nextInt();

            switch (resp) {
                case 1:
                    mazo1 = cardService.crearMazo();
                    System.out.println(mazo1.size());
                    
                    System.out.println("___________________________________________");
                    System.out.println("El Mazo ha sido creado");
                    System.out.println(mazo1);
                    break;

                case 2:
                    System.out.println("___________________________________________");
                    System.out.println("BARAJAR:");
                    cardService.barajarMazo(mazo1);
                    System.out.println(mazo1);
                    break;
                case 3:
                    System.out.println("___________________________________________");
                    cardService.siguienteCarta(mazo1);
                    break;
                case 4:
                    System.out.println("___________________________________________");
                    cardService.cartasDisponibles(mazo1);
                    break;
                case 5:
                    System.out.println("___________________________________________");
                    System.out.println("Cuantas cartas quiere entregar?");
                    cartasPedidas = leer.nextInt();
                    cardService.darCartas(mazo1, cartasPedidas);
                    break;
                case 6:
                    System.out.println("___________________________________________");
                    mazoDescubierto = cardService.cartasMonton();
                    System.out.println("La cartas del montón son: " + mazoDescubierto);
                    break;
                case 7:
                    System.out.println("___________________________________________");
                    cardService.mostrarBaraja(mazo1);
                    break;

                case 8:
                    System.out.println("___________________________________________");
                    System.out.println("ADIOS!");
                    break;

            }

        }
    }
}
