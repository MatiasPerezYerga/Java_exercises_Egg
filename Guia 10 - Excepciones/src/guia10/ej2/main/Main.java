
package guia10.ej2.main;
import java.util.Scanner;
import guia10.ej2.entidades.Calculadora;
import guia10.ej2.servicios.CalculadoraException;


public class Main {

    
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);
        
        
        System.out.println("Ingrese los valores del arreglo 1");
    
     try{   
        Double[] arreglo = new Double[4];
        
        
        
        for (int i = 0; i < 5; i++) {
           
          
            System.out.println("Ingrese el valor :"+ i);
            arreglo[i]=leer.nextDouble();
                    
           // if(arreglo[i+1]== null){}
                   
        
            }
     }catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Error.");
        
     }
        
        
        
        
        
    }
    
}
