package az.atlacademy.module01.lesson14;

public final class Player implements Comparable<Player> {

    public final int score;
    public final String name;

    public Player(int score, String name) {
        this.score = score;
        this.name = name;
    }

    @Override
    public int compareTo(Player that) {
        return this.name.compareTo(that.name);
    }

    @Override
    public String toString() {
        return String.format("Player{score=%d, name='%s'}", score, name);
    }
}
