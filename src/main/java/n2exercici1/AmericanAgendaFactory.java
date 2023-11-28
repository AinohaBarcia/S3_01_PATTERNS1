package n2exercici1;

public class AmericanAgendaFactory implements IAgendaFactory{

    @Override
    public IAddress addAddress() {
        return new AmercianAddress();
    }

    @Override
    public IPhone addPhone() {
        return new AmericanPhone();
    }
}
