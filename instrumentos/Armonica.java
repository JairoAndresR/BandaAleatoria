
package instrumentos;

/**
 *
 * @author Jairo Andres
 */
public class Armonica extends Instrumento {

    public Armonica() {
        super();
        this.nombre = "Armonica";
    }

    public void afinarInstrumento() {
        System.out.println("Afinando armonica");
    }

    public void tocarInstrumento() {
        System.out.println("Tocando armonica");
    }   
    
}
