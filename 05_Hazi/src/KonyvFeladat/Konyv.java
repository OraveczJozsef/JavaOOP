package KonyvFeladat;

public class Konyv {
	private String cim;
	private String szerzo;
	private int ev;
	private double ara;

	/* Getter & Setter */
	public String getCim() {
		return cim;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}

	public String getSzerzo() {
		return szerzo;
	}

	public void setSzerzo(String szerzo) {
		this.szerzo = szerzo;
	}

	public int getEv() {
		return ev;
	}

	public void setEv(int ev) {
		this.ev = ev;
	}

	public double getAra() {
		return ara;
	}

	public void setAra(double ara) {
		this.ara = ara;
	}

	/* Konstruktor */
	public Konyv(String cim, String szerzo, int ev, int ara) {
		this.setCim(cim);
		this.setSzerzo(szerzo);
		this.setEv(ev);
		this.setAra(ara);
	}

	public Konyv(String cim, String szerzo) {
		this(cim, szerzo, java.time.LocalDate.now().getYear(), 2500);
	}

	/* Metodus */
	public void addAra(int szazalek) {
		this.setAra(this.getAra() / 100 * szazalek + this.getAra());
	}

	@Override
	public String toString() {
		return "Cim: " + this.getCim() + ", szerzo: " + this.getSzerzo() + ", ev:" + this.getEv() + ", ara:"
				+ this.getAra();
	}

}
