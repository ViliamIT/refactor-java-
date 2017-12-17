package sk.pizzeria.objednavka;

import sk.pizzeria.produkt.Produkt;

public class ObjednavkaPolozka {
	private Integer pocet;
	private Produkt produkt;

	public ObjednavkaPolozka(Integer pocet, Produkt produkt) {
		this.pocet = pocet;
		this.produkt = produkt;
	}

	public Integer getPocet() {
		return pocet;
	}

	public void setPocet(Integer pocet) {
		this.pocet = pocet;
	}

	public Produkt getProdukt() {
		return produkt;
	}

	public void setProdukt(Produkt produkt) {
		this.produkt = produkt;
	}

}