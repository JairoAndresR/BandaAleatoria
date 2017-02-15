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
public class Piano extends Instrumento{
    
    public Piano(){
        super();
        this.nombre="Piano";
    }
    
    public void afinarInstrumento(){
        System.out.println("Afinando Piano");
    }
    public void tocarInstrumento(){
        System.out.println("Tocando piano");
    }
    
}
