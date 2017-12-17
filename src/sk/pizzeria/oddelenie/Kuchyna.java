package sk.pizzeria.oddelenie;

import sk.pizzeria.objednavka.Objednavka;
import sk.pizzeria.objednavka.ObjednavkaPolozka;
import sk.pizzeria.objednavka.StavObjednavky;
import sk.pizzeria.utils.Logger;

public class Kuchyna extends Oddelenie {

    public Kuchyna(String nazov) {
        super(nazov);
    }

    public void pripravPizzu(Objednavka objednavka) {
        objednavka.setStav(StavObjednavky.PRIPRAVUJE_SA);
        Logger.log("Kuchyna: Pizza z objednavky sa pripravuje ...");
        for (ObjednavkaPolozka o : objednavka.getZoznamPoloziek()) {
            Logger.log("Kuchyna: peciem " + o.getPizza().toString() + ", pocet kusov: " + o.getPocet());
        }

        objednavka.setStav(StavObjednavky.PRIPRAVENA);
        Logger.log("Kuchyna: Pizza z objednavky je pripravena.");
    }
}
