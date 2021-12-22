package guia10.ej1.servicios;

import guia10.ej1.entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in);
    String nombre;
    int edad;
    double altura;
    String sexo;
    double peso;
    double imc;
    boolean esmayor = false;
    float resultado;

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        nombre = leer.next();
        persona.setNombre(nombre);
        System.out.println("Ingrese la edad");
        edad = leer.nextInt();
        persona.setEdad(edad);
        /// while (sexo == "m" || sexo == "f" || sexo == "o") {
        ///     
        System.out.println("Ingrese el sexo:  f. Femenino.\n m.Masculino.\n o.Otro.");
        sexo = leer.next();
        System.out.println(sexo);
        while (!sexo.equals("m") && !sexo.equals("f") && !sexo.equals("o")) {
            System.out.println("Ingrese el sexo: \n f. Femenino.\n m.Masculino.\n o.Otro.");
            sexo = leer.next();
            System.out.println(sexo);
            System.out.println(sexo);
        }

        /// }
        persona.setSexo(sexo);
        System.out.println("Ingrese el peso en kilogramos: ");
        peso = leer.nextDouble();
        persona.setPeso(peso);
        System.out.println("Ingrese la altura en metros: ");
        altura = leer.nextDouble();
        persona.setAltura(altura);
        return persona;
    }

    public Persona calcularImc(Persona persona) {
        imc = peso / (Math.pow(altura, 2));
        persona.setImc(imc);
        System.out.println(imc);
        
        if (imc < 20) {
            System.out.println("La persona está por debajo de su peso ideal");
            persona.setResultado(-1);
        } else if (imc > 25) {
            System.out.println("La persona està en sobrepeso");
            persona.setResultado(1);
        } else {
            System.out.println("La persona está en su peso ideal.");
            persona.setResultado(0);
            //System.out.println(persona);
            }
        return persona;
    }

    public Persona esMayorDeEdad(Persona persona) throws PersonaException{
        //mediante la sentencia throws el metodo esMayor de edad lanza excepciones del tipo PersonaException,
        
            if ( edad<0 || edad>100 ){
            throw new PersonaException("El rango de edad es invalido.");
            }
            
         
        System.out.println();
        if (edad >= 18) {
            persona.setEsmayor(true);
            System.out.println("Es mayor de edad");
            
        } else {
            
        }
            System.out.println(persona);
        return persona;
        
//        }catch( PersonaException e){
//        throw e;// caputramos una expeccion
//        }catch(Exception e){  //catch para la madre de las excepciones
//        e.printStackTrace(); //creamos una expecion nuestra y devolvemos un mensaje mas legible para el usuario.
//        throw new PersonaException("Error de sistema");
        }
 }


