package modell;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Hegy {
private ArrayList<Kilatopont> kilatopontok;
	private int kovetkezoKilatopontIndex;
	

	public Hegy() {
		this.kilatopontok = new ArrayList<Kilatopont>();
		this.kovetkezoKilatopontIndex = 0;
		
		File file = new File("hegyek.txt");
		if(file.exists() == true) {
			beolvas("hegyek.txt");
		}
	}

	
	public Kilatopont kovetkezoKilatopont() {
		
		Kilatopont kilato = null;
		
		if(kovetkezoKilatopontIndex < kilatopontok.size()) {
			
			kilato = kilatopontok.get(kovetkezoKilatopontIndex);
			kovetkezoKilatopontIndex++;
		}
		
		return kilato;
	}
	
	public void ujKilatopont(Kilatopont kPont) {
		
		kilatopontok.add(kPont);
	}
	
	public void ujTura() {
		
		kovetkezoKilatopontIndex = 0;
	}
	
	public void mentes() {
		
        try
        {
        	File file = new File("hegyek.txt");
        	FileOutputStream output = new FileOutputStream(file, true);
                 
        	for(Kilatopont kPont : kilatopontok) {
        		output.write(kPont.toString().getBytes());
        		output.write("\n".getBytes());
        	}
        	
        	output.close();
        			
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	private void beolvas(String fajlNeve) {
		
        try {
        	List<String> stringkLista = Files.readAllLines(Paths.get(fajlNeve));
        	
        	for (String sor : stringkLista) {
        		String[] adatok = sor.split(",");
        		
        		
        		Kilatopont kPont = null;
        		String nev = adatok[0];
    			int magassag = Integer.parseInt(adatok[1]);
    			String kornyezet = adatok[2];
        		
    			kPont = new Kilatopont(nev, magassag, kornyezet);
    			
        		
        		kilatopontok.add(kPont);
        	}
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
        	ex.printStackTrace();
        }
    }
  

   
}
