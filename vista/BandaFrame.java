/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import instrumentos.Instrumento;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author JULIAN
 */
public class BandaFrame extends JFrame {
    
    JPanel contentpane;
    JLabel[] imagen;
    String[] nombres; /**{"Armonica","Bajo","Bateria","Guitarra","Maraca","Pandereta","Piano","Tambor","Trompeta","Violin"};**/
    
     
    
    
    public BandaFrame(Instrumento[] banda){
        super("Revolcon Cebollero");
        this.setBounds(100,50,1300,800);
        this.setVisible(true);
        contentpane = new JPanel();
        setContentPane(contentpane);
        contentpane.setLayout(new GridLayout(2,5));
        imagen = new JLabel[banda.length];
        
        for(int i=0;i<banda.length;i++){
            imagen[i] = new JLabel();
            imagen[i].setIcon(new ImageIcon(getClass().getResource("/imagenes/" + banda[i].getNombre() + ".jpg")));
            contentpane.add(imagen[i]);
        }
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
        
    }

    

    /**public static void main (String[] args){
        BandaFrame bf = new BandaFrame();
        bf.setVisible(true);
    }**/
    
}
