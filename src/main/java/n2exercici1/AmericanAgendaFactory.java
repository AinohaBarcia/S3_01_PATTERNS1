package n2exercici1;

public class AmericanAgendaFactory implements IAgendaFactory{

    private String name;
    private String surname;
    private String adress;
    private long phone;

    public AmericanAgendaFactory(String name, String surname, String adress, long phone) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public IAddress addAddress() {
        return new AmercianAddress();
    }

    @Override
    public IPhone addPhone() {
        return new AmericanPhone();
    }
}
