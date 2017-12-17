package sk.pizzeria;

import sk.pizzeria.objednavka.ObjednavkovyFormular;
import sk.pizzeria.oddelenie.*;
import sk.pizzeria.pizza.Hawai;
import sk.pizzeria.pizza.Margerita;
import sk.pizzeria.pizza.PizzaRegister;
import sk.pizzeria.pizza.Provinciale;
import sk.pizzeria.pizza.Regina;
import sk.pizzeria.utils.Logger;

public class Pizzeria {

    private Kuchyna kuchyna = new Kuchyna("Kuchyňa");
    private Pokladna pokladna = new Pokladna("Pokladňa");
    private Rozvoz rozvoz = new Rozvoz("Rozvoz");
    private Manager manager = new Manager("Manažér", kuchyna, rozvoz, pokladna);
    private JedalnyListok jedalnyListok = new JedalnyListok();
    private PrijemObjednavok prijemObjednavok = new PrijemObjednavok("Príjem Objednávok", manager, jedalnyListok);
    private PizzaRegister pizzaRegister = new PizzaRegister();


	public void objednajPizzu(ObjednavkovyFormular formular) {
        Logger.log("Pizzeria objednavky");
        prijemObjednavok.prijatObjednavkovyFormular(formular);
    }

    public void naplnitJedalnyListok() {
        jedalnyListok.getPolozky().add(new JedalnyListokPolozka(pizzaRegister.najdiPizzuPodlaNazvu("hawai")));
        jedalnyListok.getPolozky().add(new JedalnyListokPolozka(pizzaRegister.najdiPizzuPodlaNazvu("regina")));
        jedalnyListok.getPolozky().add(new JedalnyListokPolozka(pizzaRegister.najdiPizzuPodlaNazvu("margerita")));
        jedalnyListok.getPolozky().add(new JedalnyListokPolozka(pizzaRegister.najdiPizzuPodlaNazvu("provinciale")));
    }

    public void naplnitPizzaRegister() {
        Hawai hawai = new Hawai("hawai", "popis", 10.90f);
        pizzaRegister.zaregistruj(hawai);
        Regina regina = new Regina("regina", "", 12.90f);
        pizzaRegister.zaregistruj(regina);
        Margerita margerita = new Margerita("margerita", "", 9.90f);
        pizzaRegister.zaregistruj(margerita);
        Provinciale provinciale = new Provinciale("provinciale", "mnam", 10.90f);
        pizzaRegister.zaregistruj(provinciale);



    }

    public Pizzeria() {
        naplnitPizzaRegister();
        naplnitJedalnyListok();
    }

    public void vypisJedalnyListok() {
        jedalnyListok.vypisJedalnyListok();
    }
}
