/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentos;

/**
 *
 * @author Jairo Andres
 */
public class Bajo extends Instrumento{
    
    public Bajo(){
        super();
        this.nombre="Bajo";
    }
    
    public void afinarInstrumento(){
        System.out.println("Afinando bajo");
    }
    public void tocarInstrumento(){
        System.out.println("Tocando bajo");
    }
    
}
