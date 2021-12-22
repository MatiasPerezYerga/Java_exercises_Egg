/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooegg.ej2.main;


import pooegg.ej2.entidades.Circunferencia;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      Circunferencia Circ1 = new Circunferencia();                   //CON LA POO GENERAS EL MOLDE Y LA PODES INVOCAR A LA CLASE CUANTAS VECES QUIERAS CUANDO QUIERAS INSTANCIAR(CREAR UN OBJETO).
        Circ1.crearCircunferencia();
        Circ1.calcularArea();
        Circ1.calcularPerimetro();
        
     
     
    }
    
}
