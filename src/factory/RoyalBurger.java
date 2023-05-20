package factory;

import decorator.Burger;

public class RoyalBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Royal burger");
    }
}