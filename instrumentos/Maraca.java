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
public class Maraca extends Instrumento{
    
    public Maraca(){
        super();
        this.nombre="Maraca";
    }
    
    public void afinarInstrumento(){
        System.out.println("Afinando Maraca");
    }
    public void tocarInstrumento(){
        System.out.println("Tocando maraca");
    }
   
}
