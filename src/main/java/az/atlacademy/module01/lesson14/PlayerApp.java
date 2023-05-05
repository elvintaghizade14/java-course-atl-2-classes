package az.atlacademy.module01.lesson14;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerApp {

    public static void main(String[] args) {
        Player[] players = {
                new Player(20, "Smith"),
                new Player(15, "Jones"),
                new Player(20, "Jones")
        };

        System.out.println(Arrays.toString(players));
        Arrays.sort(players);
        System.out.println(Arrays.toString(players));

        System.out.println("====");
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new PlayerScoreDescComparator());
        System.out.println(Arrays.toString(players));

        System.out.println("====");
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new PlayerNameDescComparator());
        System.out.println(Arrays.toString(players));

        System.out.println("====");
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return Integer.compare(player1.score, player2.score);
            }
        });
        System.out.println(Arrays.toString(players));

        System.out.println("====");
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return player2.name.compareTo(player1.name);
            }
        });
        System.out.println(Arrays.toString(players));

        System.out.println("====");
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, (player1, player2) -> player2.name.compareTo(player1.name));
        System.out.println(Arrays.toString(players));

        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
        for (Player player : players) {
            System.out.println(player);
        }
        Arrays.stream(players).forEach(player -> System.out.println(player));
        Arrays.stream(players).forEach(System.out::println);

        System.out.println("===");
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, (p1, p2) -> {
            if (p1.score != p2.score) {
                return Integer.compare(p2.score, p1.score);
            }
            return p1.name.compareTo(p2.name);
        });
        System.out.println(Arrays.toString(players));

    }

}
