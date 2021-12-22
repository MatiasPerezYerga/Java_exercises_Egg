/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ej4;

import java.util.Scanner;
import guia9.ej4.Circulo;
import guia9.ej4.Rectangulo;
/**
 *
 * @author Usuario
 */
public class ej4 {

  
    public static void main(String[] args) {
  
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo:");
        Double base=leer.nextDouble();
        System.out.println("Ingrese el alto del rectanuglo:");
        Double altura=leer.nextDouble();
        
        Rectangulo rec= new Rectangulo(base,altura);
        
        rec.calcularArea();
        rec.calcularPerimetro();
        
        
        System.out.println("Ingrese el radio del circulo:");
        Double radio=leer.nextDouble();
         
        Circulo circ= new Circulo(radio);
        
        circ.calcularArea();
        circ.calcularPerimetro();
        
        
        
        
    }
    
}
