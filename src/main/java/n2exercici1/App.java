package n2exercici1;

import org.jetbrains.annotations.NotNull;

public class App {

    private String name;
    private enum typeAddress {american,italian};
    private IPhone phone;
    private IAddress address;

    public App(String name, IPhone phone, IAddress address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public App(@NotNull IAgendaFactory factory){
        phone = factory.addPhone();
        address = factory.addAddress();
    }
    public void addNewAgendaEntry(  ){
        phone.addPhoneNumber();
        address.addAddress();

    }
}
