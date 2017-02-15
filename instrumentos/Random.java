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
public class Random {
    
    public int Random(int numInicial, int numFinal){
       int  numero= (int) Math.floor(Math.random() * (numFinal-(numInicial-1))+(numInicial));
       return numero;
    }
}
