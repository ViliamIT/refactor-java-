package sk.pizzeria.objednavka;

import sk.pizzeria.pizza.Pizza;

public class ObjednavkaPolozka {
    private Integer pocet;
    private Pizza pizza;

    public ObjednavkaPolozka(Integer pocet, Pizza pizza) {
        this.pocet = pocet;
        this.pizza = pizza;
    }

    public Integer getPocet() {
        return pocet;
    }

    public void setPocet(Integer pocet) {
        this.pocet = pocet;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}
