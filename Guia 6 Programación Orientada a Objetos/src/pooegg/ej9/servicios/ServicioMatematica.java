package pooegg.ej9.servicios;

import pooegg.ej9.entidades.Matematica;
import java.util.Scanner;

public class ServicioMatematica {

    public void devolverMayor(Matematica mat) {
        double n1 = mat.getNumero1();
        double n2 = mat.getNumero2();
        System.out.println("Es mayor el numero" + Math.max(n1, n2));

    }

    public void calcularPotencia(Matematica mat) {
        double n1 = mat.getNumero1();
        double n2 = mat.getNumero2();
        System.out.println("La potencia del numero mayor elevada al numero menor es " + Math.pow(Math.max(n1, n2), Math.min(n1, n2)));

    }

    public void calcularRaiz(Matematica mat) {
        double n1 = mat.getNumero1();
        double n2 = mat.getNumero2();
        double n3=Math.abs(Math.min(n1, n2));
        
        System.out.println("La raiz cuadrada del menor valor es"+Math.sqrt(n3));    
    }
}
