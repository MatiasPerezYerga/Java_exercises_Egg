
package guia10.ej1.entidades;


public class Persona {

private String nombre;
private int edad;
private String sexo;
private double peso;
private double altura;
private double imc;
private boolean esmayor;
private float resultado;

    public Persona(String nombre, int edad, String sexo, double peso, double altura, double imc, boolean esmayor, float resultado) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.esmayor = esmayor;
        this.resultado = resultado;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", imc=" + imc + ", esmayor=" + esmayor + ", resultado=" + resultado + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public void setEsmayor(boolean esmayor) {
        this.esmayor = esmayor;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getImc() {
        return imc;
    }

    public boolean isEsmayor() {
        return esmayor;
    }

    public float getResultado() {
        return resultado;
    }

}
