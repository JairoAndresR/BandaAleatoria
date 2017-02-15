package logica;

import vista.BandaFrame;
import instrumentos.Violin;
import instrumentos.Tambor;
import instrumentos.Instrumento;
import instrumentos.Piano;
import instrumentos.Armonica;
import instrumentos.Bateria;
import instrumentos.Pandereta;
import instrumentos.Random;
import instrumentos.Maraca;
import instrumentos.Guitarra;
import instrumentos.Trompeta;
import instrumentos.Bajo;

/**
 *
 * @author Jairo Andres
 */
public class Logica {

        private Random ran = new Random();
        private Armonica armonica = new Armonica();
        private Bajo bajo = new Bajo();
        private Bateria bateria = new Bateria();
        private Guitarra guitarra = new Guitarra();
        private Maraca maraca = new Maraca();
        private Pandereta pandereta = new Pandereta();
        private Piano piano = new Piano();
        private Tambor tambor = new Tambor();
        private Trompeta trompeta = new Trompeta();
        private Violin violin = new Violin();

    public Logica() {


        int aleat;
        int num = ran.Random(3, 10);
        System.out.println("Se crearon " + num + " musicos");
        Instrumento musicos[] = new Instrumento[num];
        Instrumento instru[] = new Instrumento[10];
        instru[0] = armonica;
        instru[1] = bajo;
        instru[2] = bateria;
        instru[3] = guitarra;
        instru[4] = maraca;
        instru[5] = pandereta;
        instru[6] = piano;
        instru[7] = tambor;
        instru[8] = trompeta;
        instru[9] = violin;

        
        for (int i = 0; i <= num - 1; i++) {
            aleat = ran.Random(0, 9);
            musicos[i] = instru[aleat];
            System.out.println("Musico " + (i + 1) + " toca " + musicos[i].getNombre());
        }
          
        afinar(musicos);
        notas(musicos);
        tocar(musicos);
        
        BandaFrame bf = new BandaFrame(musicos);        
        bf.setVisible(true);
    }
    
   public void afinar(Instrumento[] banda) {
        for (int i = 0; i <= banda.length - 1; i++) {
            banda[i].afinarInstrumento();
        }
    }
   
    public void tocar(Instrumento[] banda) {
        for (int i = 0; i <= banda.length - 1; i++) {
            banda[i].tocarInstrumento();
        }
    }
    
    public void notas(Instrumento[] banda) {
        for (int i = 0; i <= banda.length - 1; i++) {
             System.out.println(banda[i].getNombre()+" en "+banda[i].getNotas()[ran.Random(0, 6)]);
        }
    }
    

}
