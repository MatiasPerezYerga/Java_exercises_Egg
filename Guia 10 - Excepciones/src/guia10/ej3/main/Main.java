
package guia10.ej3.main;
import guia10.ej3.entidades.DivisionNumero;
import guia10.ej3.servicios.DivisionNumeroServicio;
import guia10.ej3.servicios.DivisionNumeroException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        DivisionNumeroServicio dns= new DivisionNumeroServicio();
        
      try{  
        System.out.println("Ingrese el primer numero:");
        String n1= leer.next();
        if(n1==null){throw new InputMismatchException();}
        System.out.println("Ingrese el segundo numero");
        String n2= leer.next();
        
       DivisionNumero divNum= dns.crearDivisionNumero(n1, n2);
        
      if (divNum==null){ throw new NumberFormatException();}
               
       
       Integer int1 = dns.convertir(divNum.getCadena1());
       Integer int2=dns.convertir(divNum.getCadena2());
       
          System.out.println(int1);
          System.out.println(int2);
       
        System.out.println("La division es"+ dns.division(int1, int2)); 
        
      }catch( ArithmeticException e){
            System.out.println(" Excepcion Aritmetica");
      }catch( InputMismatchException a){
        System.out.println("INPUT MIS AMTCH");
      }catch( NumberFormatException b){
          System.out.println(" NUMBER FORMAT BOY");}
      
    }
    
}
