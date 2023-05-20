package command;

public class Cashier {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void placeOrder() {
        // Assume order is placed by the cashier
        command.execute();
    }
}
