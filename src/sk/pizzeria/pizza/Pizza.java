package sk.pizzeria.pizza;

public abstract class Pizza {
	private String nazov;
	private String popis;
	private float cena;

	public Pizza(String nazov, String popis, float cena) {
		this.nazov = nazov;
		this.popis = popis;
		this.cena = cena;
	}

	public Pizza() {
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

	@Override
	public String toString() {
		return "Pizza: ";
	}

	public String toString(String str) {
		return "Pizza: ";
	}
}
