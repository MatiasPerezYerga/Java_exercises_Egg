
package guia9.ej4;


public class  Rectangulo implements calculosFormas {


private double base;
private double altura;




    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    
    
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public void calcularArea() {
        double area=base*altura;
        System.out.println("El área del rectángulo es :"+area);
        
    }

    @Override
    public void calcularPerimetro() {
        double perimetro= 2*base+2*altura;
        
        System.out.println("El perímetro del rectángulo es :"+ perimetro);
    }


}
