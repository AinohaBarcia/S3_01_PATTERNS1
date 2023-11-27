package n1exercici1;

import java.util.ArrayList;

public class Undo {

    private static Undo instance;
    private ArrayList comandos = new ArrayList<>();

    private Undo() {

    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addComando (String comand) {

        comandos.add(comand);
    }

    public void deleteComando (String comand) {
        comand = comand.toLowerCase();
        if (comandos.contains(comand)) {
            comandos.remove(comand);
        }else{
            System.out.println("El comando " + comand + " no está en la lista");
        }
    }
    public void printComnandos(){

        for (int i=0;i<comandos.size();i++);
        System.out.println(comandos);

    }


}
