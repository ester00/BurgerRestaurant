package factory;

import decorator.Burger;

public class VegetarianBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Vegetarian burger");
    }
}