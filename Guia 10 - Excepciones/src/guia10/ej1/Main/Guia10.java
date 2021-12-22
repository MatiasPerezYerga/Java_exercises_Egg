
package guia10.ej1.Main;
import guia10.ej1.entidades.Persona;
import guia10.ej1.servicios.ServicioPersona;
import guia10.ej1.servicios.PersonaException;

public class Guia10 {


    public static void main(String[] args) throws PersonaException {

        ServicioPersona servicePerson = new ServicioPersona();
        
        try{
        Persona human = servicePerson.crearPersona();
  
        servicePerson.esMayorDeEdad(human);
        }catch(PersonaException e){System.out.println(e.getMessage());
        }
    }
    
}
