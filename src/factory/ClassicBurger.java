package factory;

import decorator.Burger;

public class ClassicBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing classic burger");
    }
}