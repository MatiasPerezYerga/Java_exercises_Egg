package pooegg.ej4.entidades;
import java.util.Scanner;
public class Rectangulo {
    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
 public void crearRectangulo(){
     Scanner teclado=new Scanner(System.in);
     System.out.println("Ingrese la base en cm para crear el rectangulo");
     base= teclado.nextFloat();
     System.out.println("Ingrese la altura en cm para crear el rectangulo");
     altura=teclado.nextFloat();
     
 }
 public void calcularArea(){
 float area= base*altura;
     System.out.println("El area del rectangulo es: "+area);
 } 
  public void calcularPerimetro(){
   float perimetro=((base+altura)/2);
      System.out.println("El perimetro del rectangulo es: "+perimetro);
 } 
public void dibujarRectangulo(){
    
    for (int i = 1; i <= altura; i++) {
        for (int j = 1; j <= base; j++) {
            if (i == 1 || i == altura) {
                    System.out.print("*");
                } else if ((j == base) || (j == 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
           
            
        }
         System.out.println("");
    }
}    
    
}
