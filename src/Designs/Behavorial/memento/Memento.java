package src.Designs.Behavorial.memento;

public class Memento {
    private int level;
    private int score;


    public Memento(int level, int score) {
        this.level = level;
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}
