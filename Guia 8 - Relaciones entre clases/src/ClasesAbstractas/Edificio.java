
package ejemploPeladoClasesAbstractas;



public final  class Edificio extends Estructura{
    
    private Integer pisos;

    public Edificio(Integer pisos,Double superficieTotal) {
        super(superficieTotal);
        this.pisos = pisos;
    }

    public Integer getPisos() {
        return pisos;
    }

    public Double getSuperficieCubierta() {
        return superficieCubierta;
    }

    public Double getSuperficieTotal() {
        return superficieTotal;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public void setSuperficieCubierta(Double superficieCubierta) {
        this.superficieCubierta = superficieCubierta;
    }

    public void setSuperficieTotal(Double superficieTotal) {
        this.superficieTotal = superficieTotal;
    }

    @Override
    public void calcularSuperficie(double ancho, double largo) {
    this.superficieCubierta=ancho*largo*this.pisos;
    
        System.out.println("La superficie cubierta es "+ superficieCubierta);
    }
    
    
    
    
    
    
}
