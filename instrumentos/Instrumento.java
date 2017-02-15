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
public class Instrumento {
    protected String nombre;
    protected String notas[]= {"Do","Re","Mi","Fa","So","La", "Si"};
    
    
    public void afinarInstrumento(){
        
    }
    
    public void tocarInstrumento(){
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getNotas() {
        return notas;
    }

    public void setNotas(String[] notas) {
        this.notas = notas;
    }

    
    
}
