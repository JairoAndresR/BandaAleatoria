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
public class Violin extends Instrumento{
    
    public Violin(){
        super();
        this.nombre="Violin";
    }
    
    public void afinarInstrumento(){
        System.out.println("Afinando violin");
    }
    public void tocarInstrumento(){
        System.out.println("Tocando violin");
    }
    
}
