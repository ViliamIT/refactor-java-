package sk.pizzeria.objednavka;

import java.util.ArrayList;
import java.util.List;

public class ObjednavkovyFormular {
    private  List<ObjednavkovyFormularPolozka> polozky = new ArrayList<ObjednavkovyFormularPolozka>();

    public List<ObjednavkovyFormularPolozka> getPolozky() {
        return polozky;
    }

    public void setPolozky(List<ObjednavkovyFormularPolozka> polozky) {
        this.polozky = polozky;
    }
}
