package sk.pizzeria.oddelenie;

import sk.pizzeria.PizzeriaApp;
import sk.pizzeria.objednavka.Objednavka;
import sk.pizzeria.objednavka.StavObjednavky;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rozvoz extends Oddelenie {

	private static Logger LOG = LoggerFactory.getLogger(PizzeriaApp.class);

	public Rozvoz(String nazov) {
		super(nazov);
	}

	public void dorucPizzu(Objednavka objednavka) {
		LOG.info("Rozvoz: Dorucujem pizzu ...");
		objednavka.setStav(StavObjednavky.DORUCUJE_SA);
		LOG.info("Rozvoz: Pizza bola dorucena");
		objednavka.setStav(StavObjednavky.DORUCENA);

	}
}
