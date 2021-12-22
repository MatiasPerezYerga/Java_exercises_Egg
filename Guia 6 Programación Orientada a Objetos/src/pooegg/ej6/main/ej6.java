package pooegg.ej6.main;

import pooegg.ej6.servicios.CafeteraServicios;
import java.util.Scanner;
import pooegg.ej6.entidades.Cafetera;

public class ej6 {

    public static void main(String[] args) {
        CafeteraServicios cafeteraServicio = new CafeteraServicios();
        Cafetera cafetera=cafeteraServicio.iniciarCafetera();
        cafeteraServicio.llenarCafetera(cafetera);
        cafeteraServicio.servirTaza(cafetera);
        cafeteraServicio.agregarCafe(cafetera);
        
    }

}
