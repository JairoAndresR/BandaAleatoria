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
public class Bateria extends Instrumento{
    
    public Bateria(){
        super();
        this.nombre="Bateria";
    }
    
    public void afinarInstrumento(){
        System.out.println("Afinando bateria");
    }
    public void tocarInstrumento(){
        System.out.println("Tocando baateria");
    }
    
}
