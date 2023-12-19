package n2exercici1;

public class ItalianAgendaFactory implements IAgendaFactory{
    @Override
    public IAddress addAddress() {
        return new ItalianAddress();
    }

    @Override
    public IPhone addPhone() {
        return new AmericanPhone();
    }
}
