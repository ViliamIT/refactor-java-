package sk.pizzeria;

import sk.pizzeria.utils.Logger;

import java.util.ArrayList;
import java.util.List;

public class JedalnyListok {
    private List<JedalnyListokPolozka> polozky = new ArrayList<JedalnyListokPolozka>();

    public List<JedalnyListokPolozka> getPolozky() {
        return polozky;
    }

    public void setPolozky(List<JedalnyListokPolozka> polozky) {
        this.polozky = polozky;
    }

    public void vypisJedalnyListok() {
        int index =0;
        for(JedalnyListokPolozka p : polozky) {
            Logger.log(index++ + ". " + "pizza: " + p.getPizza().getNazov() + " ..." + " cena: " + p.getPizza().getCena() + " EUR");
        }
    }
}
