
package guia10.ej2.entidades;

public class Calculadora {


private Double[] arreglo1;
private Double [] arreglo2;

    public Calculadora(Double[] arreglo1, Double[] arreglo2) {
        this.arreglo1 = new Double[4];
        this.arreglo2 = new Double[4];
        
    }

    public Calculadora() {
    }

    public Double[] getArreglo1() {
        return arreglo1;
    }

    public Double[] getArreglo2() {
        return arreglo2;
    }

    public void setArreglo1(Double[] arreglo1) {
        this.arreglo1 = arreglo1;
    }

    public void setArreglo2(Double[] arreglo2) {
        this.arreglo2 = arreglo2;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "arreglo1=" + arreglo1 + ", arreglo2=" + arreglo2 + '}';
    }


    
}
