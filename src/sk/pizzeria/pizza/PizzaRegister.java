package sk.pizzeria.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaRegister {
	private List<Pizza> register = new ArrayList<Pizza>();

	public List<Pizza> getRegister() {
		return register;
	}

	public void zaregistruj(Pizza pizza) {
		register.add(pizza);
	}

	public Pizza najdiPizzuPodlaNazvu(String pizzaNazov) {
		for (Pizza p : register) {
			if (p.getNazov().equalsIgnoreCase(pizzaNazov))
				return p;
		}
		return null;
	}
}
