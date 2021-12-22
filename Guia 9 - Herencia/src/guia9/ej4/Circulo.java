
package guia9.ej4;


public class  Circulo implements calculosFormas{
    
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public void calcularArea() {
        double area= Math.PI*Math.pow(radio, 2);
        System.out.println("El area del circulo es:"+ area  );
    }

    @Override
    public void calcularPerimetro() {
        double perimetro= 2*Math.PI*radio;
        System.out.println("El perimetro del circulo es "+ perimetro);
    }
    
    
    
}
