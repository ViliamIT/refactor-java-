package sk.pizzeria.oddelenie;

import sk.pizzeria.objednavka.Objednavka;
import sk.pizzeria.objednavka.StavObjednavky;
import sk.pizzeria.utils.Logger;

public class Rozvoz extends Oddelenie {
    public Rozvoz(String nazov) {
        super(nazov);
    }

    public void dorucPizzu(Objednavka objednavka) {
        Logger.log("Rozvoz: Dorucujem pizzu ...");
        objednavka.setStav(StavObjednavky.DORUCUJE_SA);
        Logger.log("Rozvoz: Pizza bola dorucena");
        objednavka.setStav(StavObjednavky.DORUCENA);

    }
}
