package sk.pizzeria.oddelenie;

import sk.pizzeria.JedalnyListok;
import sk.pizzeria.objednavka.*;
import sk.pizzeria.utils.Logger;

import static sk.pizzeria.utils.Logger.log;

public class PrijemObjednavok extends Oddelenie {
    private Manager manager;
    private JedalnyListok jedalnyListok;

    public void prijatObjednavkovyFormular(ObjednavkovyFormular objednavkovyFormular) {
        Objednavka objednavka = vytvoritObjednavku(objednavkovyFormular);
        log("PrijemObjednavok: Posielam objednavku");
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
            ObjednavkaPolozka polozka = new ObjednavkaPolozka(ofp.getPocet(), jedalnyListok.getPolozky().get(ofp.getJedalnyListokPolozkaId()).getPizza());
            objednavka.getZoznamPoloziek().add(polozka);
        }
        Logger.log("PrijemObjednavok: Objednavka vytvorena");

        return objednavka;
    }
}
