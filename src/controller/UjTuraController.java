package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import modell.Hegy;

public class UjTuraController implements ActionListener {

    private JLabel label;
    private Hegy hegy;

    public UjTuraController(JLabel label, Hegy hegy) {
        this.label = label;
        this.hegy = hegy;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        hegy.ujTura();
        label.setText("");

    }
}
