package command;

public class CommandMain {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Cashier cashier = new Cashier();

        Command burgerCommand = new BurgerCommand(chef, "Royal");
        cashier.setCommand(burgerCommand);
        cashier.placeOrder();
    }
}