package command;

public class BurgerCommand implements Command {
    private Chef chef;
    private String burgerType;

    public BurgerCommand(Chef chef, String burgerType) {
        this.chef = chef;
        this.burgerType = burgerType;
    }

    @Override
    public void execute() {
        chef.makeBurger(burgerType);
    }
}