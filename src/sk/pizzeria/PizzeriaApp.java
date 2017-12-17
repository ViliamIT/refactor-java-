package sk.pizzeria;

import sk.pizzeria.objednavka.ObjednavkovyFormular;
import sk.pizzeria.objednavka.ObjednavkovyFormularPolozka;
import sk.pizzeria.utils.Logger;

public class PizzeriaApp {

    public static void main(String[] args) {
        PizzeriaApp pizzeriaApp = new PizzeriaApp();
        ObjednavkovyFormular objednavkovyFormular = new ObjednavkovyFormular();
        objednavkovyFormular.getPolozky().add(new ObjednavkovyFormularPolozka(1, 0));
        objednavkovyFormular.getPolozky().add(new ObjednavkovyFormularPolozka(2, 1));
        objednavkovyFormular.getPolozky().add(new ObjednavkovyFormularPolozka(1, 2));
        objednavkovyFormular.getPolozky().add(new ObjednavkovyFormularPolozka(1, 3));

        Pizzeria pizzeria = new Pizzeria();
        pizzeria.vypisJedalnyListok();
        pizzeriaApp.vypisObjednavkovyFormular(objednavkovyFormular);
        pizzeria.objednajPizzu(objednavkovyFormular);
    }

    public void vypisObjednavkovyFormular(ObjednavkovyFormular objednavkovyFormular) {
        Logger.log("Objednavka:");
        for(ObjednavkovyFormularPolozka p : objednavkovyFormular.getPolozky()) {
            Logger.log("polozka: " + p.getJedalnyListokPolozkaId() + " ... pocet:" + p.getPocet());
        }
    }

}
