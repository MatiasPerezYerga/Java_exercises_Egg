/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooegg.ej3.entidades;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Operacion {

    private float numero1;
    private float numero2;

    public Operacion(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public float getNumero1() {
        return numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    public void crearOperacion(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        numero1=leer.nextFloat();
        System.out.println("Ingrese el numero 2");
        numero2=leer.nextFloat();
        
    }
    
    public void sumar(){
    
    float suma= numero1+numero2;
        System.out.println("La suma de los numeros es "+suma);
    }
   public void restar(){
    
    float restar = numero1-numero2;
        System.out.println("La resta de los numeros es "+restar);
    } 
   public void multiplicar(){
if (numero1!=0 && numero2!=0){    
    float producto = numero1*numero2;
        System.out.println("La multiplicacion de los numeros es "+producto);}else{System.out.println("ERROR");}
    } 
   public void dividir(){
    if (numero1!=0 && numero2!=0){ 
    float division = numero1/numero2;
        System.out.println("La division de los numeros es "+division);}else{System.out.println("ERROR NO SE PUEDE DIVIDIR POR CERO BURRO");}
    } 
    
    
}
