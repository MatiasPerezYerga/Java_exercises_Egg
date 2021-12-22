package pooegg.ej6.servicios;

import pooegg.ej6.entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicios {

    Scanner leer = new Scanner(System.in);

    public Cafetera iniciarCafetera() {

    Cafetera cafetera = new Cafetera();
        System.out.println("Ingrese la capacidad màxima de la cafetera");
        float capMax = leer.nextFloat();
        cafetera.setCapacidadMaxima(capMax);
        System.out.println("Ingrese la cantidad hasta donde ha sido llenada");
        float capAct = leer.nextFloat();
        cafetera.setCantidadActual(capAct);
        System.out.println(cafetera);
        return cafetera;
    }

    public void llenarCafetera(Cafetera cafetera) {

        float capMax = cafetera.getCapacidadMaxima();
        cafetera.setCantidadActual(capMax);
        System.out.println(cafetera);
        

    }

    public void servirTaza(Cafetera cafetera) {
        System.out.println("Ingrese la capacidad de la taza vacia");
        float capTaza = leer.nextFloat();
        float volumenTaza = 0;
        float capActual = cafetera.getCantidadActual();
        ;
        if (capActual == 0) {
            System.out.println("Debe recargar la cafetera:");
        } else if (capActual < capTaza) {
            capTaza = capActual;
            cafetera.setCantidadActual(0);
            System.out.println("Se han llenado " + capTaza + " ml.");
        } else {
            volumenTaza = capTaza;
            System.out.println("La taza se ha llenado y tiene " + volumenTaza + " ml.");
            capActual = capActual - volumenTaza;
            cafetera.setCantidadActual(capActual);

        }
        System.out.println(cafetera);
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
        System.out.println(cafetera);
    }

    public void agregarCafe(Cafetera cafetera) {
        System.out.println("Ingresar la cantidad de cafè que se va a agregar");
        float agregarCafe = leer.nextFloat();
        float canAct = cafetera.getCantidadActual();
        float capMax = cafetera.getCapacidadMaxima();
        float verificacion = canAct + agregarCafe;
        if (verificacion <= capMax) {
            canAct = canAct + agregarCafe;
            cafetera.setCantidadActual(canAct);
            System.out.println(canAct);
        } else {
            System.out.println("Se rebalsará la cafetera");
        }
        System.out.println(cafetera);
    }

}
//capacidadMaxima;
  //  private float cantidadActual;
