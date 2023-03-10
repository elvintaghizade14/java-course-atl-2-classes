package az.atlacademy.module01.lesson03_p3;

public class AlphabetApp {

    public static void main(String[] args) {
        char letter = 'a';
        while (letter <= 'z') {
            System.out.print(letter);
            letter++;
        }
        System.out.print("\n------------\n");
        for (char letter2 = 'z'; letter2 >= 'a'; letter2--) {
            System.out.print(letter2);
        }
    }

}
