package n1exercici1;

public class Main {
    public static void main(String[] args) {

        Undo undo = Undo.getInstance();

        boolean rpta = undo instanceof Undo;
        System.out.println(rpta);


        undo.addComando("derecha");
        undo.addComando("arriba");
        undo.addComando("abajo");
        undo.printComnandos();
        undo.deleteComando("derecha");
        undo.printComnandos();
    }

}
