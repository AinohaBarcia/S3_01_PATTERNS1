package n2exercici1;

public class AmericanAgendaFactory implements IAgendaFactory{

    //Meter aquin los parametros que necesitamos para crear agenda y luego meter el constructor


    @Override
    public IAddress addAddress() {
        return new AmercianAddress();
    }

    @Override
    public IPhone addPhone() {
        return new AmericanPhone();
    }
}
