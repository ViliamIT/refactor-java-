package sk.pizzeria.oddelenie;

import sk.pizzeria.objednavka.Objednavka;
import sk.pizzeria.objednavka.StavObjednavky;
import sk.pizzeria.utils.Logger;

public class Manager extends Oddelenie {
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
        Logger.log("Manazer: Prijata nova objednavka");
        objednavka.setStav(StavObjednavky.PRIJATA);
        kuchyna.pripravPizzu(objednavka);
        rozvoz.dorucPizzu(objednavka);
        pokladna.prijatPlatbu(objednavka);
        Logger.log("Manazer: Objednavka je vybavena");
        objednavka.setStav(StavObjednavky.VYBAVENA);
    }


}
