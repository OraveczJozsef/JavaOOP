package AlkalmazottFeladat;

public class Alkalmazott {
	private String nev;
	private int fizetes;

	/* Getter */
	public String getNev() {
		return this.nev;
	}

	public int getFizetes() {
		return this.fizetes;
	}

	/* Setter */
	public void setNev(String nev) {
		this.nev = nev;
	}

	public void setFizetes(int fizetes) {
		this.fizetes = fizetes;
	}

	/* Konstruktor */
	public Alkalmazott(String nev, int fizetes) {
		this.setNev(nev);
		this.setFizetes(fizetes);
		System.out.println("-----");
	}

	public Alkalmazott(String nev) {
		this(nev, 250000);
	}

	/* Metodus */
	public void addFizetes(int osszeg) {
		this.setFizetes(this.getFizetes() + osszeg);
	}

	@Override
	public String toString() {
		return "Nev: " + this.getNev() + ", fizetes: " + this.getFizetes();
	}

	public boolean getFizetesHatar(int min, int max) {
		if (this.getFizetes() >= min && this.getFizetes() <= max)
			return true;

		return false;
	}

	public double getAdo() {
		return (double) this.getFizetes() / (100 * 16);
	}

	public boolean getNagyobbFizetes(Alkalmazott alk) {
		if (this.getFizetes() > alk.getFizetes())
			return true;

		return false;
	}
}
