/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploPeladoInterfaces;


public interface AccionMascota {
    
    
    //metodos sin cuerpo ya que despues le voy a tener que especificar en cada clase /entidad el cuerpo o accionar
    public void pasear(int cantidadVueltas);
    public void molestarDueno();
    public void comerAlimento(int cantidad);
    
    
}
