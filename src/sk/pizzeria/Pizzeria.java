/*
 * Pizzeria sluzi na spracovanie objednavok, sledovanie objednavok az po ich vybavenie  
 * 
 * 
 */
package sk.pizzeria;

import sk.pizzeria.objednavka.ObjednavkovyFormular;
import sk.pizzeria.oddelenie.*;
import sk.pizzeria.pizza.Hawai;
import sk.pizzeria.pizza.Margerita;
import sk.pizzeria.produkt.ProduktRegister;
import sk.pizzeria.pizza.Provinciale;
import sk.pizzeria.pizza.Regina;
//import sk.pizzeria.utils.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pizzeria {
	private static Logger LOG = LoggerFactory.getLogger(Pizzeria.class);
	private Kuchyna kuchyna = new Kuchyna("Kuchyňa");
	private Pokladna pokladna = new Pokladna("Pokladňa");
	private Rozvoz rozvoz = new Rozvoz("Rozvoz");
	private Manager manager = new Manager("Manažér", kuchyna, rozvoz, pokladna);
	private JedalnyListok jedalnyListok = new JedalnyListok();
	private PrijemObjednavok prijemObjednavok = new PrijemObjednavok("Príjem Objednávok", manager, jedalnyListok);
	private ProduktRegister produktRegister = new ProduktRegister();

	public void objednajPizzu(ObjednavkovyFormular formular) {
		LOG.info("**Pizzeria objednavky**");
		prijemObjednavok.prijatObjednavkovyFormular(formular);
	}

	public void naplnitJedalnyListok() {
		jedalnyListok.getPolozky().add(new JedalnyListokPolozka(produktRegister.najdiProduktPodlaNazvu("hawai")));
		jedalnyListok.getPolozky().add(new JedalnyListokPolozka(produktRegister.najdiProduktPodlaNazvu("regina")));
		jedalnyListok.getPolozky().add(new JedalnyListokPolozka(produktRegister.najdiProduktPodlaNazvu("margerita")));
		jedalnyListok.getPolozky().add(new JedalnyListokPolozka(produktRegister.najdiProduktPodlaNazvu("provinciale")));
	}

	public void naplnitPizzaRegister() {
		Hawai hawai = new Hawai("hawai", "popis", 10.90f);
		produktRegister.zaregistruj(hawai);
		Regina regina = new Regina("regina", "", 12.90f);
		produktRegister.zaregistruj(regina);
		Margerita margerita = new Margerita("margerita", "", 9.90f);
		produktRegister.zaregistruj(margerita);
		Provinciale provinciale = new Provinciale("provinciale", "mnam", 10.90f);
		produktRegister.zaregistruj(provinciale);

	}

	public Pizzeria() {
		naplnitPizzaRegister();
		naplnitJedalnyListok();
	}

	public void vypisJedalnyListok() {
		jedalnyListok.vypisJedalnyListok();
	}
}
