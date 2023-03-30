package az.atlacademy.module01.lesson05;

public class MethodsApp {

    public static void mainV1(String[] args) {
        int a = 6;
        System.out.println(a);
        int b = a;
        a = 4;
        System.out.println(a);
        System.out.println(b);

        int[] ints1 = {8};
        int[] ints2 = ints1;
        System.out.println(ints1);  // Type + @ + qarishiq deyer
        System.out.println(ints2);
        ints1[0] = -1;
        System.out.println(ints1[0]);
        System.out.println(ints2[0]);

    }

    public static void main(String[] args) {
        int a = 5;
        int aPow = pow(a);
        System.out.println(a);
        System.out.println(aPow);
    }

    public static int pow(int num) {
        return num * num;
    }

}
