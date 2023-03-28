package az.atlacademy.module01.lesson04_p3;

import java.util.Scanner;

public class Homework02App {

    public static void main(String[] args) {
        char[][] table = new char[5][5];
        final int row = (int) (Math.random() * 5);
        final int col = (int) (Math.random() * 5);
        System.err.println(row + " - " + col);
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = '-';
            }
        }

        System.out.println("All set. Get ready to rumble!");
        printTable(table);

        Scanner scan = new Scanner(System.in);
        int guessedRow;
        int guessedColumn;
        while (true) {
            guessedRow = scan.nextInt() - 1;
            guessedColumn = scan.nextInt() - 1;
            if (guessedRow == row && guessedColumn == col) {
                table[guessedRow][guessedColumn] = 'x';
                printTable(table);
                System.out.println("You have won!");
                break;
            } else {
                table[guessedRow][guessedColumn] = '*';
                printTable(table);
            }
        }

    }

    private static void printTable(char[][] table) {
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " | ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " | ");
            for (int j = 0; j < 5; j++) {
                System.out.print(table[i][j] + " | ");
            }
            System.out.println();
        }
    }

}
