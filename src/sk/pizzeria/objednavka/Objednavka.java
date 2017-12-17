package sk.pizzeria.objednavka;

import java.util.ArrayList;
import java.util.List;

public class Objednavka {
	private List<ObjednavkaPolozka> zoznamPoloziek = new ArrayList<ObjednavkaPolozka>();
	private StavObjednavky stav;

	public List<ObjednavkaPolozka> getZoznamPoloziek() {
		return zoznamPoloziek;
	}

	public void setZoznamPoloziek(List<ObjednavkaPolozka> zoznamPoloziek) {
		this.zoznamPoloziek = zoznamPoloziek;
	}

	public void setStav(StavObjednavky stav) {
		this.stav = stav;
	}

	public StavObjednavky getStav() {
		return stav;
	}
}
