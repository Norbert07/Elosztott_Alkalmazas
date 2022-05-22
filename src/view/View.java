package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import controller.KovetkezoKilatoController;
import controller.UjTuraController;
import modell.Hegy;

public class View {

    public void createView(Hegy hegy) {

        JFrame frame = new JFrame();
        GridLayout layout = new GridLayout(2, 2, 20, 25);
        frame.setLayout(layout);

        JLabel kilatoLabel = new JLabel("", SwingConstants.CENTER);

        JButton kilatoGomb = new JButton("Kovetkezo Kilato");
        KovetkezoKilatoController kkc = new KovetkezoKilatoController(kilatoLabel, hegy);
        kilatoGomb.addActionListener(kkc);
        frame.add(kilatoGomb);

        frame.add(kilatoLabel);

        JButton ujTuraGomb = new JButton("Uj Tura");
        UjTuraController ujTura = new UjTuraController(kilatoLabel, hegy);
        ujTuraGomb.addActionListener(ujTura);
        frame.add(ujTuraGomb);

        frame.setSize(450, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

