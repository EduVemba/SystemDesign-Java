package src.Designs.Behavorial.command;

public class ConcreteCommand implements Command {
    private Cliente cliente;

    public ConcreteCommand(Cliente c) {
        this.cliente = c;
    }

    @Override
    public void execute() {
        this.cliente.speak();
    }

    @Override
    public void delete() {
        this.cliente.Nothing();
    }
}
