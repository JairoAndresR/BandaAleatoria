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
public class Guitarra extends Instrumento{
    
    public Guitarra(){
        super();
        this.nombre="Guitarra";
    }
    
    public void afinarInstrumento(){
        System.out.println("Afinando guitarra");
    }
    public void tocarInstrumento(){
        System.out.println("Tocando guitarra");
    }
   
}