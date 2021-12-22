package guia9.ej2;

import guia9.ej2.Electrodomestico;
import guia9.ej2.Lavadora;
import guia9.ej2.Televisor;
import java.util.ArrayList;

public class ej2Main {

    public static void main(String[] args) {
        double precioTotal = 0.00;
        double precioTotalLav = 0.00;
        double precioTotalTel = 0.00;
//Electrodomestico e= new Lavadora(40,3500.00,"negra",'C',18.00);
//Lavadora lav= new Lavadora();
        ArrayList<Electrodomestico> electroMuestrario = new ArrayList();
        for (int i = 0; i < 2; i++) {

            Electrodomestico e = new Electrodomestico();
            Lavadora lav = new Lavadora(0, e.precio, e.color, e.consumoEnergetico, e.peso);
            lav.crearLavadora();
            lav.precioFinal();

            electroMuestrario.add(lav);
            Televisor tel = new Televisor(0, false, e.precio, e.color, e.consumoEnergetico, e.peso);

            tel.crearTelevisor();
            System.out.println(tel);
            tel.precioFinal();

            electroMuestrario.add(tel);
        }

        System.out.println(electroMuestrario);

        for (Electrodomestico c : electroMuestrario) {
            if (c instanceof Lavadora) {
                
                precioTotalLav = precioTotalLav + c.precio;
            }
        }
        System.out.println("El precio total de lavadoras en venta es " + precioTotalLav);
        for (Electrodomestico c : electroMuestrario) {
            if (c instanceof Televisor) {
                
                precioTotalTel = precioTotalTel + c.precio;
            }
        }
 System.out.println("El precio total de televisores en venta es " + precioTotalTel);
        for (Electrodomestico g : electroMuestrario) {
            precioTotal = precioTotal + g.precio;
        }
        
        System.out.println("El precio total es " + precioTotal);
    }

}
