package sk.pizzeria.oddelenie;

import sk.pizzeria.JedalnyListok;
import sk.pizzeria.PizzeriaApp;
import sk.pizzeria.objednavka.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrijemObjednavok extends Oddelenie {

	private static Logger LOG = LoggerFactory.getLogger(PizzeriaApp.class);

	private Manager manager;
	private JedalnyListok jedalnyListok;

	public void prijatObjednavkovyFormular(ObjednavkovyFormular objednavkovyFormular) {
		Objednavka objednavka = vytvoritObjednavku(objednavkovyFormular);
		LOG.info("PrijemObjednavok: Posielam objednavku");
		manager.prislaObjednavka(objednavka);
	}

	public PrijemObjednavok(String nazov, Manager manager, JedalnyListok jedalnyListok) {
		super(nazov);
		this.manager = manager;
		this.jedalnyListok = jedalnyListok;
	}

	private Objednavka vytvoritObjednavku(ObjednavkovyFormular objednavkovyFormular) {
		Objednavka objednavka = new Objednavka();
		objednavka.setStav(StavObjednavky.VYTVORENA);
		for (ObjednavkovyFormularPolozka ofp : objednavkovyFormular.getPolozky()) {
			ObjednavkaPolozka polozka = new ObjednavkaPolozka(ofp.getPocet(),
					jedalnyListok.getPolozky().get(ofp.getJedalnyListokPolozkaId()).getProdukt());
			objednavka.getZoznamPoloziek().add(polozka);
		}
		LOG.info("PrijemObjednavok: Objednavka vytvorena");

		return objednavka;
	}
}
