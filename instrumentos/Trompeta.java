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
public class Trompeta extends Instrumento{
    
    public Trompeta(){
        super();
        this.nombre="Trompeta";
    }
    
    public void afinarInstrumento(){
        System.out.println("Afinando trompeta");
    }
    public void tocarInstrumento(){
        System.out.println("Tocando trompeta");
    }
   
}
