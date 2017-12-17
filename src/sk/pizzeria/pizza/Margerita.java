package sk.pizzeria.pizza;

import sk.pizzeria.pizza.Pizza;

public class Margerita extends Pizza {
	public Margerita(String nazov, String popis, float cena) {
		super(nazov, popis, cena);
	}

	@Override
	public String toString() {
		return super.toString() + "Margerita";
	}

}
