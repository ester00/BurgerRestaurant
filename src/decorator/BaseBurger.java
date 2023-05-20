package decorator;

public class BaseBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing base burger");
    }
}