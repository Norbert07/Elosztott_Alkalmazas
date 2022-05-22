package norbertvizsga;


import modell.Hegy;
import modell.Kilatopont;
import view.*;

/**
 *
 * @author Norbert
 */
public class NorbertVizsga {

    public static void main(String[] args) {
      
        Hegy hegy = new Hegy();

        Kilatopont kp1 = new Kilatopont("Kilatopont1", 1000, "Novenyes");
        Kilatopont kp2 = new Kilatopont("Kilatopont2", 2000, "Sziklas");
        Kilatopont kp3 = new Kilatopont("Kilatopont3", 3000, "Novenyes");
        Kilatopont kp4 = new Kilatopont("Kilatopont4", 3000, "Novenyes");

        hegy.ujKilatopont(kp1);
        hegy.ujKilatopont(kp2);
        hegy.ujKilatopont(kp3);
        hegy.ujKilatopont(kp4);

        View view = new View();
        view.createView(hegy);

        hegy.mentes(); 
    }
}
