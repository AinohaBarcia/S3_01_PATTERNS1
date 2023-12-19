package n2exercici1;

import java.util.ArrayList;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        ArrayList<App>agenda = new ArrayList<>();
        App app = configAgenda();
        app.addNewAgendaEntry();
        agenda.add(app);

    }

    private static App configAgenda (){
        App app;
        IAgendaFactory agendaFactory;
        String american = System.getProperty("os.name").toLowerCase();

        if (american.contains("american")) {
            agendaFactory = new AmericanAgendaFactory("Jason","Lee","Av. Street 54",98432456);
        } else {
            agendaFactory = new ItalianAgendaFactory("Paola","Sanmarino","Strada San Marco 23", 765689);
        }
        app = new App(agendaFactory);
        return app;

    }
}
