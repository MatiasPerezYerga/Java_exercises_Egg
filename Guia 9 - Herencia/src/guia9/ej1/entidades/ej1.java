
package guia9.ej1.entidades;

import guia9.ej1.entidades.Gato;
import guia9.ej1.entidades.Perro;
import guia9.ej1.entidades.Caballo;
import guia9.ej1.entidades.Animal;

public class ej1 {


    public static void main(String[] args) {

    
    Animal gato= new Gato("Pelusa","Galletas",15,"Siames");    
    Animal perro= new Perro ("Teddy","Croquetas",10,"Chihuahua");        
    Animal llobaca= new Caballo("Relámpago","Pasto",25,"Fino");
    
    
        gato.Alimentarse();
        perro.Alimentarse();
        llobaca.Alimentarse();
    }
    
}
