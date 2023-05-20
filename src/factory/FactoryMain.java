package factory;

import decorator.Burger;

public class FactoryMain {
    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BurgerFactory();

        Burger royalBurger = burgerFactory.createBurger("Royal");
        royalBurger.prepare();

        Burger classicBurger = burgerFactory.createBurger("Classic");
        classicBurger.prepare();

        Burger vegetarianBurger = burgerFactory.createBurger("Vegetarian");
        vegetarianBurger.prepare();
    }
}