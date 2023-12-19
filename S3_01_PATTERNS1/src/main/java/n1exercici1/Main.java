package n1exercici1;

public class Main {
    public static void main(String[] args) {

        Undo undo = Undo.getInstance();
        Undo undo1 = Undo.getInstance();

        boolean rpta = undo instanceof Undo;
        System.out.println(rpta);
        boolean rpta2 = undo instanceof Undo;
        System.out.println(rpta2);

        undo.addComando("derecha");
        undo1.addComando("dosPuntos");
        undo.addComando("arriba");
        undo1.addComando("abajo");
        undo.addComando("izquierda");
        undo.printComnandos();
        undo1.deleteComando();
        undo.printComnandos();
    }

}
