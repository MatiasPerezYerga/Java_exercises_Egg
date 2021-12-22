
package pooegg.ej5.entidades;

/// ATRIBUTOS
public class Cuenta {
private int numeroCuenta;
private long dni;
private double saldoactual;
private double interes;

//CONSTRUCTORES
    public Cuenta(int numeroCuenta, long dni, double saldoactual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoactual = saldoactual;
      
    }
//CONSTRUCTOR VACIO
    public Cuenta() {
    }
// GETTER AND SETTER
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

       public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
    }

   
// METODO TO STRING
    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoactual=" + saldoactual+"}";
    }



}
