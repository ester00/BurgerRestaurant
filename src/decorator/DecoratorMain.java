package decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Burger baseBurger = new BaseBurger();
        baseBurger.prepare();

        Burger burgerWithGarlicSauce = new GarlicSauceDecorator(baseBurger);
        burgerWithGarlicSauce.prepare();

        Burger burgerWithKetchup = new KetchupDecorator(baseBurger);
        burgerWithKetchup.prepare();

        Burger burgerWithGarlicSauceAndKetchup = new KetchupDecorator(new GarlicSauceDecorator(baseBurger));
        burgerWithGarlicSauceAndKetchup.prepare();
    }
}