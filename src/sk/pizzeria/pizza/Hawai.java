package sk.pizzeria.pizza;

public class Hawai extends Pizza {
	public Hawai(String nazov, String popis, float cena) {
		super(nazov, popis, cena);
	}

	@Override
	public String toString() {
		return super.toString() + "Hawai";
	}
}
