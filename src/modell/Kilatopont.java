
package modell;

public class Kilatopont extends Hely implements ILatnivalo{
    	private String nev;
	private int magassag;
	private String kornyezet;
	
	
	public Kilatopont(String nev, int magassag, String kornyezet) {
		this.nev = nev;
		this.magassag = magassag;
		
		if(kornyezet.equalsIgnoreCase("Novenyes")) {
			this.kornyezet = "Novenyes";
		}
		else {
			this.kornyezet = "Sziklas";
		}
	}

	@Override
	public void latogatokRogzitese() {
		// ...
	}

	@Override
	public String toString() {
		return (nev + "," + magassag + "," + kornyezet);
	}
}
