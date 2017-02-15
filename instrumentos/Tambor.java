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
public class Tambor extends Instrumento{
    
    public Tambor(){
        super();
        this.nombre="Tambor";
    }
    
    public void afinarInstrumento(){
        System.out.println("Afinando tambor");
    }
    public void tocarInstrumento(){
        System.out.println("Tocando tambor");
    }
    
}