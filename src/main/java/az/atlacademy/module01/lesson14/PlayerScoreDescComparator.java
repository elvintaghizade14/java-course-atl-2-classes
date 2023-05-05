package az.atlacademy.module01.lesson14;

import java.util.Comparator;

public class PlayerScoreDescComparator implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        return Integer.compare(player2.score, player1.score);
    }

}
