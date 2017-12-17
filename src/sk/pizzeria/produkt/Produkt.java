package sk.pizzeria.produkt;

public abstract class Produkt {
	private String nazov;
	private String popis;
	private float cena;

	public Produkt(String nazov, String popis, float cena) {
		super();
		this.nazov = nazov;
		this.popis = popis;
		this.cena = cena;
	}

	public Produkt() {
		super();
	}

	public String getNazov() {
		return nazov;
	}

	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

	public String getPopis() {
		return popis;
	}

	public void setPopis(String popis) {
		this.popis = popis;
	}

	public float getCena() {
		return cena;
	}

	public void setCena(float cena) {
		this.cena = cena;
	}

}
