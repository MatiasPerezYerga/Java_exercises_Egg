
package guia10.ej3.entidades;


public class DivisionNumero {
   
    private String cadena1;
    private String cadena2;

    public String getCadena1() {
        return cadena1;
    }

    public String getCadena2() {
        return cadena2;
    }

    public void setCadena1(String cadena1) {
        this.cadena1 = cadena1;
    }

    public void setCadena2(String cadena2) {
        this.cadena2 = cadena2;
    }

    public DivisionNumero(String cadena1, String cadena2) {
        this.cadena1 = cadena1;
        this.cadena2 = cadena2;
    }

    public DivisionNumero() {
    }

    @Override
    public String toString() {
        return "DivisionNumero{" + "cadena1=" + cadena1 + ", cadena2=" + cadena2 + '}';
    }
        
}
