package pooegg.eej6.servicios;

import pooegg.eej6.entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicios {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {

        System.out.println("Ingrese la palabra para crear el juego ahorcado:");
        String palabra = leer.next();
        String[] palabraVector = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraVector[i] = palabra.substring(i, i + 1);
            // System.out.println("_");

        }
        System.out.println("Ingresar la cantidad de intentos");
        int intentos = leer.nextInt();

        int cantidadLetras = 0;

        boolean[] palabraBooleana = new boolean[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            palabraBooleana[i] = false;
        }

        Ahorcado ahorcado = new Ahorcado(palabraVector, cantidadLetras, intentos, palabraBooleana);
        return ahorcado;
    }

    public void longitud(Ahorcado ahorcado) {

        System.out.println("La longitud de la palabra es " + ahorcado.getPalabra().length);

    }

    public void buscarLetra(Ahorcado ahorcado) {
        String[] palabra = ahorcado.getPalabra();
        String[] palabraOculta = new String[palabra.length];
        boolean[] palabraBooleana = new boolean[palabra.length];
        int resp = 2;
//        for (int i = 0; i < palabra.length; i++) {
//            palabraBooleana[i] = false;
//            System.out.println(palabraBooleana[i]);
//        }
        int intentos = ahorcado.getIntentos();
        boolean encontro;
        do {
            encontro = false;
            System.out.println("Eliga una letra");
            String letra = leer.next();  // control que deberia corroborar si la letra ya fue descubierta
            //DEBE SER UJN VERIFICADOR DE PARA QUE PUEDA HACER TODO LO DESEADO. VERIFICADOR DE BOLLEANO TRUE CON UN CONTADOR FOR.   if(palabraBooleana[i]= true);
            for (int i = 0; i < palabra.length; i++) {

                if (letra.equals(palabra[i])) {
                    palabraOculta[i] = palabra[i];
                    palabraBooleana[i] = true;
                    //System.out.print(palabraBooleana[i]);
                    encontro = true;
                }

            }

            if (encontro == false) {
                intentos--;
            }
/// METODO PARA IMPRIMIR LA PALABRA BOOLEAN SIEMPRE Y CUANDO SEA VERDADERA LA LETRA. SI  LA LETRA SUB i ES Verdadera, entonces se imprimirá,
            System.out.println(intentos);
            for (int j = 0; j < palabra.length; j++) {

                if (palabraBooleana[j]) {
                    System.out.print(palabraOculta[j]);
// de lo contrario, imprimira un guion.

                } else {
                    System.out.print("_");

                }
            }

//            System.out.println("");
//            System.out.println("SALIR PERRITO?");
//
//            System.out.println("1. Si");
//            System.out.println("2.No");
//            resp = leer.nextInt();
            
        } while ( intentos > 0);
    }

}
//            for (int i = 0; i < palabra.length; i++) {
//                palabraBooleana[i] = false;
//                System.out.println(palabraBooleana[i]);
//            }
//            System.out.println();
//            for (int i = 0; i < palabra.length; i++) {
//                palabraOculta[i] = "_";
//                System.out.print(palabraOculta[i]);
//            }
