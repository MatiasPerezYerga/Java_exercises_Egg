
package ejemploPeladoClasesAbstractas;


public abstract class Estructura {
    
    protected Double superficieCubierta;
    protected Double superficieTotal;
    
    public Estructura(Double superficieTotal){
        this.superficieTotal=superficieTotal;
        
    }

    public void setSuperficieCubierta(Double superficieCubierta) {
        this.superficieCubierta = superficieCubierta;
    }

    public void setSuperficieTotal(Double superficieTotal) {
        this.superficieTotal = superficieTotal;
    }

    public Double getSuperficieCubierta() {
        return superficieCubierta;
    }

    public Double getSuperficieTotal() {
        return superficieTotal;
    }

public abstract void calcularSuperficie(double ancho, double largo);

    
}
