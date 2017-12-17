package sk.pizzeria.pizza;

import sk.pizzeria.produkt.Produkt;

public abstract class Pizza extends Produkt {
	private String recept;

	public Pizza(String nazov, String popis, float cena) {
		super(nazov, popis, cena);
	}

	public Pizza() {
		super();
	}

	public String getRecept() {
		return recept;
	}

	public void setRecept(String recept) {
		this.recept = recept;
	}

	@Override
	public String toString() {
		return "Pizza: ";
	}

	public String toString(String str) {
		return "Pizza: ";
	}
}
