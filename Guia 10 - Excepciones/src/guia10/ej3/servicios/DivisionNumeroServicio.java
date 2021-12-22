
package guia10.ej3.servicios;
import guia10.ej3.entidades.DivisionNumero;
import guia10.ej3.servicios.DivisionNumeroException;

public class DivisionNumeroServicio {
     
    
    public DivisionNumero crearDivisionNumero(String cadena1, String cadena2){
        DivisionNumero divNum =new DivisionNumero(cadena1,cadena2);
        
        return divNum;
    }
    
     //Esto convertirá Java String a java Integer y lo almacenará en la variable entera especificada. 
    
    public Integer convertir(String cadena){
        
        
        int n= Integer.parseInt(cadena);
     
        
              
        return  n;
    }
    
    
    
    public Integer division(Integer n1,Integer n2){
        Integer n3= n1/n2;
        return  n3;             
    }
    
}
