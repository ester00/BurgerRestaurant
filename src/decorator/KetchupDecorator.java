package decorator;

public class KetchupDecorator extends BurgerDecorator implements Burger {
    public KetchupDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public void prepare() {
        super.prepare();
        addKetchup();
    }

    private void addKetchup() {
        System.out.println("Adding ketchup");
    }
}