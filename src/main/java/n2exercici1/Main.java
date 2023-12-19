package n2exercici1;

import java.util.ArrayList;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        ArrayList<App>agenda = new ArrayList<>();
        App app = configAgenda();
        app.addNewAgendaEntry();
        agenda.add(app);
     /*Como metemos las entradas en la agenda?, como enviamos los datos de la agenda a la aplicacion,
            por donde pasamos los parametros*/
    }

    private static App configAgenda (){
        App app;
        IAgendaFactory agendaFactory;
        String american = System.getProperty("os.name").toLowerCase();

        if (american.contains("american")) {
            agendaFactory = new AmericanAgendaFactory();
        } else {
            agendaFactory = new ItalianAgendaFactory();
        }
        app = new App(agendaFactory);
        return app;

    }
}
