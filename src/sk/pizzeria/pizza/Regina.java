package sk.pizzeria.pizza;

import sk.pizzeria.pizza.Pizza;

public class Regina extends Pizza {
	public Regina(String nazov, String popis, float cena) {
		super(nazov, popis, cena);
	}

	@Override
	public String toString() {
		return super.toString() + "Regina";
	}
}
