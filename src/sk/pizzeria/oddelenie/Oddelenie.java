package sk.pizzeria.oddelenie;

public abstract class Oddelenie {
	private String nazov;

	public Oddelenie(String nazov) {
		this.nazov = nazov;
	}

	public String getNazov() {
		return nazov;
	}
}
