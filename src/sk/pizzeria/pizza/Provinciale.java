package sk.pizzeria.pizza;

public class Provinciale extends Pizza {
	public Provinciale(String nazov, String popis, float cena) {
		super(nazov, popis, cena);
	}

	@Override
	public String toString() {
		return super.toString() + "Provinciale";
	}
}
