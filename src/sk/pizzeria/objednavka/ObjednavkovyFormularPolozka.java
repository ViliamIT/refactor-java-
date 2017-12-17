package sk.pizzeria.objednavka;



public class ObjednavkovyFormularPolozka {
    private Integer pocet;
    private Integer jedalnyListokPolozkaId;

    public ObjednavkovyFormularPolozka(int pocet, int jedalnyListokPolozkaId) {
        this.pocet = pocet;
        this.jedalnyListokPolozkaId = jedalnyListokPolozkaId;
    }

    public Integer getPocet() {
        return pocet;
    }

    public void setPocet(Integer pocet) {
        this.pocet = pocet;
    }

    public Integer getJedalnyListokPolozkaId() {
        return jedalnyListokPolozkaId;
    }

    public void setJedalnyListokPolozkaId(Integer jedalnyListokPolozkaId) {
        this.jedalnyListokPolozkaId = jedalnyListokPolozkaId;
    }
}
