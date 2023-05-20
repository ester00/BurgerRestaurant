package factory;

import decorator.Burger;

public class BurgerFactory {
    public Burger createBurger(String type) {
        switch (type) {
            case "Royal":
                return new RoyalBurger();
            case "Classic":
                return new ClassicBurger();
            case "Vegetarian":
                return new VegetarianBurger();
            default:
                throw new IllegalArgumentException("Invalid burger type: " + type);
        }
    }
}