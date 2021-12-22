package pooegg.ej8.servicios;

import pooegg.ej8.entidades.Cadena;
import java.util.Scanner;

public class ServicioCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ;
    public Cadena crearCadena() {
        System.out.println("Ingrese una frase:");
        String frase = leer.next();
        int longitud = frase.length();
        Cadena cadena = new Cadena();
        cadena.setFrase(frase);
        cadena.setLongitud(longitud);
        return new Cadena(frase, longitud);///se debe retornar como NEW CLASE (ATRIBUTO 1, ATRIBUTO 2)
    }

    public void contarVocales(Cadena cadena) {
        String frase = cadena.getFrase();
        frase = frase.toLowerCase();
        int longitud = cadena.getLongitud();
        int vocales = 0;
        for (int i = 0; i < longitud; i++) {
            char ch = frase.charAt(i); //funcion que devuelve el caracter de referencia;
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vocales;
            }
        }
        System.out.println("La cantidad de vocales son" + vocales);

    }

    public void escribirInvertido(Cadena cadena) {
        String frase = cadena.getFrase();
        frase = frase.toLowerCase();
        int longitud = cadena.getLongitud();
        String fraseInver;
        for (int i = longitud; i >= 1; i--) {
            fraseInver = frase.substring(i - 1, i);
            System.out.print(fraseInver);
        }

    }

    public void vecesRepetido(Cadena cadena) {
        String frase = cadena.getFrase();
        frase = frase.toLowerCase();
        int longitud = cadena.getLongitud();
        System.out.println("Ingrese la letra que desea ver cuantas veces se repite:");
        String letra = leer.next();
        int repetido = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i + 1).equals(letra)) {
                repetido++;
            }

        }

        System.out.println("La cantidad de veces que repite la letra " + letra + " es " + repetido + ".");
    }

    public void compararLongitud(Cadena cadena) {
        String frase = cadena.getFrase();
        frase = frase.toLowerCase();
        int longitud = cadena.getLongitud();
        System.out.println("Ingrese una nueva frase con la cual se desea comparar la longitud:");
        String nuevafrase = leer.next();
        int nuevalongitud = nuevafrase.length();
        if (longitud == nuevalongitud) {
            System.out.println("Las frase tienen la misma longitud de caractéres y son " + longitud);
        } else {
            System.out.println("Las frases tienen distinta longitud y son " + longitud + " y " + nuevalongitud + " respectivamente.");
        }

    }

    public void unirFrases(Cadena cadena) {
        String frase = cadena.getFrase();
        frase = frase.toLowerCase();
        System.out.println("Ingrese una nueva frase para unirla");
        String nuevafrase = leer.next();
        System.out.println(frase + " " + nuevafrase);

    }

    public void remplazar(Cadena cadena) {
        String frase = cadena.getFrase();
        frase = frase.toLowerCase();
        int longitud = cadena.getLongitud();
        System.out.println("Ingrese la letra que desea reemplazar");
        String letra = leer.next();
        System.out.println("Ingrese el caractér por el que desea reemplazar");
        String caracter = leer.next();
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i + 1).equals(letra)) {
                System.out.print(caracter);
            } else {
                System.out.print(frase.substring(i, i + 1));
            }

        }
        System.out.println("");
    }

    public boolean contiene(Cadena cadena) {
        String frase = cadena.getFrase();
        frase = frase.toLowerCase();
        int longitud = cadena.getLongitud();
        boolean validacion = false;
        System.out.println("Ingrese la letra que desea averiguar si contiene:");
        String letra = leer.next();
        for (int i = 0; i < longitud; i++) {

            if (frase.substring(i, i + 1).equals(letra)) {
                validacion = true;
                
            }

        }
        return validacion;
    }

}
