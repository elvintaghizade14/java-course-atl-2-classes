package az.atlacademy.lesson05;

public class TernaryOperatorApp {

    public static void main(String[] args) {
        int a = 21;

        System.out.println('&');

        String result = a % 2 == 0 ? "EVEN" : "ODD";
        char result2 = (a - 1) % 2 == 0 ? 'O' : 'E';

        System.out.println(result);
        System.out.println(result2);

        if (a % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

}
