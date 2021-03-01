package Feladat;

public class Szemely {
	/* Valtozok */
	private String nev;
	private int suly;
	private double magassag;

	/* Getter */
	public String getNev() {
		return this.nev;
	}

	public int getSuly() {
		return this.suly;
	}

	public double getMagassag() {
		return this.magassag;
	}
	

	/* Setter */
	public void setNev(String nev) {
		this.nev = nev;
	}

	public void setSuly(int suly) {
		this.suly = suly;
	}

	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}

	/* Konstruktor */
	public Szemely(String nev, int suly, double magassag) { 
		this.setNev(nev);
		this.setSuly(suly);
		this.setMagassag(magassag); 
	}
	

	/* Metodus */
	public double getTesttomegIndex() {
		return (double) this.suly / (this.magassag * this.magassag);
	}
	public String getAlkat() {
		double tti = this.getTesttomegIndex();
		
		if (tti < 18.5)
			return "sovany";
		else if (tti > 25)
			return "kover";
		else
			return "normal";
	}
	@Override
	public String toString() {
		return "Nev: " + nev + ", suly: " + suly + ", magassag: " + magassag + ", " + this.getTesttomegIndex() + ": " + this.getAlkat();
	}
	
}
