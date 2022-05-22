
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

import modell.Hegy;
import modell.Kilatopont;

public class KovetkezoKilatoController implements ActionListener{
    private JLabel label;
    private Hegy hegy;
    
    public KovetkezoKilatoController(JLabel label, Hegy hegy){
        this.label = label;
        this.hegy = hegy;
    
    
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Kilatopont kPont = hegy.kovetkezoKilatopont();
       
       if(kPont !=null ){
       label.setText(kPont.toString());
       }
           
    }  
}
