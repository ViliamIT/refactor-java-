package sk.pizzeria.oddelenie;

import sk.pizzeria.PizzeriaApp;
import sk.pizzeria.objednavka.Objednavka;

import sk.pizzeria.objednavka.StavObjednavky;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Manager extends Oddelenie {
	private static Logger LOG = LoggerFactory.getLogger(PizzeriaApp.class);

	private Kuchyna kuchyna;
	private Rozvoz rozvoz;
	private Pokladna pokladna;

	public Manager(String nazov, Kuchyna kuchyna, Rozvoz rozvoz, Pokladna pokladna) {
		super(nazov);
		this.kuchyna = kuchyna;
		this.rozvoz = rozvoz;
		this.pokladna = pokladna;
	}

	public void prislaObjednavka(Objednavka objednavka) {
		LOG.info("Manazer: Prijata nova objednavka");
		objednavka.setStav(StavObjednavky.PRIJATA);
		kuchyna.pripravPizzu(objednavka);
		rozvoz.dorucPizzu(objednavka);
		pokladna.prijatPlatbu(objednavka);
		LOG.info("Manazer: Objednavka je vybavena");
		objednavka.setStav(StavObjednavky.VYBAVENA);
	}

}
