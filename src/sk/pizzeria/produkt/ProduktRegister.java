package sk.pizzeria.produkt;

import java.util.ArrayList;
import java.util.List;

public class ProduktRegister {
	private List<Produkt> register = new ArrayList<Produkt>();

	public List<Produkt> getRegister() {
		return register;
	}

	public void zaregistruj(Produkt produkt) {
		register.add(produkt);
	}

	public Produkt najdiProduktPodlaNazvu(String produktNazov) {
		for (Produkt p : register) {
			if (p.getNazov().equalsIgnoreCase(produktNazov))
				return p;
		}
		return null;
	}
}
