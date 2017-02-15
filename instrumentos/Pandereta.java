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
public class Pandereta extends Instrumento{
    
    public Pandereta(){
        super();
        this.nombre="Pandereta";
    }
    
    public void afinarInstrumento(){
        System.out.println("Afinando pandereta");
    }
    public void tocarInstrumento(){
        System.out.println("Tocando pandereta");
    }
    
}
