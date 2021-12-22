package pooegg.ej7.main;

import pooegg.ej7.servicios.ServicioPersona;
import pooegg.ej7.entidades.Persona;
import java.util.Scanner;

public class ej7 {

    public static void main(String[] args) {
        ServicioPersona servicioPersona = new ServicioPersona();

        Persona persona1 = servicioPersona.crearPersona();

        servicioPersona.calcularImc(persona1);
        servicioPersona.esMayorDeEdad(persona1);

        Persona persona2 = servicioPersona.crearPersona();

        servicioPersona.calcularImc(persona2);
        servicioPersona.esMayorDeEdad(persona2);

        Persona persona3 = servicioPersona.crearPersona();
        servicioPersona.calcularImc(persona3);
        servicioPersona.esMayorDeEdad(persona3);

        Persona persona4 = servicioPersona.crearPersona();
        servicioPersona.calcularImc(persona4);
        servicioPersona.esMayorDeEdad(persona4);

        float debajo = 0, bien = 0, sobrep = 0;
        double resul = 9;

        resul = persona1.getResultado();
        if (resul == 1) {
            sobrep++;
        } else if (resul == 0) {
            bien++;
        } else if (resul ==-1){
            debajo++;
        }
        

        resul = persona2.getResultado();
       
        if (resul==1) {
            sobrep++;
        } else if (resul== 0) {
            bien++;
        } else if (resul==-1){
            debajo++;
        }
      
        
        resul = persona3.getResultado();
        
        if (resul == 1) {
            sobrep++;
        } else if (resul == 0) {
            bien++;
        } else {
            debajo++;
        }

        resul = persona4.getResultado();
        
        if (resul == 1) {
            sobrep++;
        } else if (resul == 0) {
            bien++;
        } else {
            debajo++;
        }

        boolean sex1, sex2, sex3, sex4;
        float esmayor = 0, esmenor = 0;
        if (persona1.isEsmayor()) {
            esmayor++;
        } else {
            esmenor++;
        }
        if (persona2.isEsmayor()) {
            esmayor++;
        } else {
            esmenor++;
        }
        if (persona3.isEsmayor()) {
            esmayor++;
        } else {
            esmenor++;
        }
        if (persona4.isEsmayor()) {
            esmayor++;
        } else {
            esmenor++;
        }

        System.out.println("El porcentaje de personas por debajo son :" + (debajo/4) * 100 + "%, " + (sobrep/4) * 100 + "% están en sobrepeso y " + (bien/4) * 100 + "% se encuentran en sus pesos normales.");
        System.out.println("El porcentaje de personas mayores es: " + esmayor / 4 * 100 + "% y de personas menores es " + esmenor / 4 * 100 + "%.");

    }

}
