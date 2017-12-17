package sk.pizzeria.oddelenie;

import sk.pizzeria.PizzeriaApp;
import sk.pizzeria.objednavka.Objednavka;
import sk.pizzeria.objednavka.StavObjednavky;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pokladna extends Oddelenie {

	private static Logger LOG = LoggerFactory.getLogger(PizzeriaApp.class);

	private float ucet;

	public Pokladna(String nazov) {
		super(nazov);
	}

	public void prijatPlatbu(Objednavka objednavka) {
		LOG.info("Pokladna: Platba za pizzu prijata");
		objednavka.setStav(StavObjednavky.ZAPLATENA);
	}
}
