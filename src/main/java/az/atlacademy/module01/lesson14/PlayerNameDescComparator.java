package az.atlacademy.module01.lesson14;

import java.util.Comparator;

public class PlayerNameDescComparator implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        return player2.name.compareTo(player1.name);
    }

}
