package decorator;

public class GarlicSauceDecorator implements Burger {
    private Burger burger;

    public GarlicSauceDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public void prepare() {
        burger.prepare();
        addGarlicSauce();
    }

    private void addGarlicSauce() {
        System.out.println("Adding garlic sauce");
    }
}

