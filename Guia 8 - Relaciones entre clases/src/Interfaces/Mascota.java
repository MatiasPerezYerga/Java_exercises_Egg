
package ejemploPeladoInterfaces;
import ejemploPeladoInterfaces.AccionMascota;


public class Mascota implements AccionMascota{

private String nombre;
private String apodo;

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + '}';
    }

    @Override
    public void pasear(int cantidadVueltas) {
        System.out.println("La mascota quiere pasear "+cantidadVueltas+".");
    }

    @Override
    public void molestarDueno() {
        System.out.println("La mascota está molestando al dueño!!!");
    }

    @Override
    public void comerAlimento(int cantidad) {
        System.out.println("La mascota ha comido "+ cantidad+" kilogramos de alimento!");
    }

    
}
