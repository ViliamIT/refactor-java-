package sk.pizzeria.oddelenie;

import sk.pizzeria.PizzeriaApp;
import sk.pizzeria.objednavka.Objednavka;
import sk.pizzeria.objednavka.ObjednavkaPolozka;
import sk.pizzeria.objednavka.StavObjednavky;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Kuchyna extends Oddelenie {

	private static Logger LOG = LoggerFactory.getLogger(PizzeriaApp.class);

	public Kuchyna(String nazov) {
		super(nazov);
	}

	public void pripravPizzu(Objednavka objednavka) {
		objednavka.setStav(StavObjednavky.PRIPRAVUJE_SA);
		LOG.info("Kuchyna: Pizza z objednavky sa pripravuje ...");
		for (ObjednavkaPolozka o : objednavka.getZoznamPoloziek()) {
			LOG.info("Kuchyna: peciem " + o.getProdukt().toString() + ", pocet kusov: " + o.getPocet());
		}

		objednavka.setStav(StavObjednavky.PRIPRAVENA);
		LOG.info("Kuchyna: Pizza z objednavky je pripravena.");
	}
}
