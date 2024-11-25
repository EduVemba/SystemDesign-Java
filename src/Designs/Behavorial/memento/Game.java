package src.Designs.Behavorial.memento;

/**
 * Originator
 */
public class Game {
    private int level;
    private int score;

    public void setState(int level, int score) {
        this.level = level;
        this.score = score;
        System.out.println("Game state set: Level " + level + ", Score " + score);
    }
    public Memento saveStateAToMemento() {
        return new Memento(level, score);
    }

    public void restoreStateAFromMemento(Memento memento) {
        level = memento.getLevel();
        score = memento.getScore();
        System.out.println("Game state restored: Level " + level + ", Score " + score);
    }
}
