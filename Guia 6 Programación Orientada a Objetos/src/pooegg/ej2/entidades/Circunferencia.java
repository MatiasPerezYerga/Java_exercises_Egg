/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooegg.ej2.entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Circunferencia {

    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia(double radio, double area, double perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void crearCircunferencia() { ///
      
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio en centimetros de la Cirucunferencia para calcular el area y el perimetro:");
        radio = leer.nextDouble();
        
       
       // Circ1.setRadio(radio1);
       // Circ1.setArea(3.141516 * Math.pow(getRadio(), 2));
       // System.out.println();
       // Circ1.setPerimetro(2 * 3.141516 * getRadio());
        //    p = 2 * 3.141516 * getRadio();
        //System.out.println();

/// libro1.setTitulo(titulo);
        // return this.radio;
    }

      public void calcularPerimetro() {
    perimetro=2 * Math.PI * radio;       
          System.out.println("El valor del perimetro en cm cuadrados es:" + perimetro + "cm"); /// si unicamente el radio es el atributo, 
//deberia definir una variable para el perimetro dentro del subproceso.
          
      }
      public void calcularArea(){
      area=Math.PI* Math.pow(radio, 2);
          System.out.println("El valor del área en cm cuadrados es:" + area + "cm^2");}
      
      
      
      
      
      
      
      
      
      
}

///public double calcularPerimetro(double radio) {
///return p;
///}

///}
