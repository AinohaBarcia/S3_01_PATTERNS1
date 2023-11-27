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
            System.out.println("Se ha instanciado la clase");
        }else {
            System.out.println("La clase ya estaba instanciada");
        }
        return instance;
    }

    public void addComando (String comand) {

        comandos.add(comand);
        System.out.println("Se ha añadido " + comand);
    }

    public void deleteComando () {

        if (comandos.isEmpty()){
            System.out.println("La lista está vacia");
        }else{
           comandos.remove(comandos.size()-1);
            System.out.println("Se ha eliminado la última posición de la lista" );

        }
    }
    public void printComnandos(){

        for (int i=0;i<comandos.size();i++);
        System.out.println(comandos);

    }


}
