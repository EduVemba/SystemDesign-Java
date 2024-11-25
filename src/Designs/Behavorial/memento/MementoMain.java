package src.Designs.Behavorial.memento;

public class MementoMain {
    public static void main(String[] args) {
        Game game = new Game();
        Caretaker caretaker = new Caretaker();


        game.setState(1,250);
        caretaker.addMemento(game.saveStateAToMemento());

        game.setState(2,100);
        caretaker.addMemento(game.saveStateAToMemento());

        game.setState(3,500);
        caretaker.addMemento(game.saveStateAToMemento());


        game.restoreStateAFromMemento(caretaker.getMemento(0));
        game.restoreStateAFromMemento(caretaker.getMemento(1));
    }
}
