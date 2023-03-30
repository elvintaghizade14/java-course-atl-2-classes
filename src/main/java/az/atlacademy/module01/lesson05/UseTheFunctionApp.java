package az.atlacademy.module01.lesson05;

import java.util.Scanner;

public class UseTheFunctionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        //  min( max(x,y), max(y,z), x+y+z)

        double sum = x + y + z;         // 5.45
        double maxYz = Math.max(y, z);  // 2.25
        double maxXy = Math.max(x, y);  // 2.25

        double min1 = Math.min(maxXy, maxYz); // 2.25
        double lastMin = Math.min(min1, sum); // 2.25
        System.out.println(lastMin);
    }

}
