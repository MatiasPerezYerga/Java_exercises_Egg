/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ej3.Main;

/**
 *
 * @author Usuario
 */
public class NewMainej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        maximumOccurringCharacter();
      }
    
    
       public static char maximumOccurringCharacter() {
   
        String text="helloworld";
        int a=0;
        int max=0;
        String b="-";
        char maximus='-';
        String[] cadena = new String[text.length()];
            for (int i=0; i<text.length(); i++) {
            cadena[i]=text.substring(i,i+1);    
            }
            
            for (int i=0; i<cadena.length; i++) {
            b= cadena[i];
                System.out.println("Imprimir cadena b"+ b);
                System.out.println(b);
                for (int  j=0; j<cadena.length; j++) {
                    if (cadena[j].equals(b)){
                     a++;}
                    
                }
                System.out.println(b+" aparece " +a+" veces.");
                if (a>=max){
                    maximus= b.charAt(0); max=a;
                    System.out.println(maximus);
                }
                a=0;
                
            }
            
            System.out.println("maximus"+maximus);
        
        return maximus; }
}
