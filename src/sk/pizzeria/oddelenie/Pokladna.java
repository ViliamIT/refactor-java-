package sk.pizzeria.oddelenie;

import sk.pizzeria.objednavka.Objednavka;
import sk.pizzeria.objednavka.StavObjednavky;
import sk.pizzeria.utils.Logger;

public class Pokladna extends Oddelenie {

    private float ucet;

    public Pokladna(String nazov) {
        super(nazov);
    }

    public void prijatPlatbu(Objednavka objednavka) {
        Logger.log("Pokladna: Platba za pizzu prijata");
        objednavka.setStav(StavObjednavky.ZAPLATENA);
    }
}
