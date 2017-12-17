package sk.pizzeria;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JedalnyListok {
	private static Logger LOG = LoggerFactory.getLogger(PizzeriaApp.class);

	private List<JedalnyListokPolozka> polozky = new ArrayList<JedalnyListokPolozka>();

	public List<JedalnyListokPolozka> getPolozky() {
		return polozky;
	}

	public void setPolozky(List<JedalnyListokPolozka> polozky) {
		this.polozky = polozky;
	}

	public void vypisJedalnyListok() {
		int index = 0;
		for (JedalnyListokPolozka p : polozky) {
			LOG.info(index++ + ". " + "pizza: " + p.getProdukt().getNazov() + " ..." + " cena: "
					+ p.getProdukt().getCena() + " EUR");
		}
	}
}
