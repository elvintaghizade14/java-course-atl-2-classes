package az.atlacademy.module01.lesson05_quiz1;

import java.util.Scanner;

public class TaskA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double maxSalary = -1;
        double salary;
        while (sc.hasNext()) {
            salary = sc.nextDouble();
            maxSalary = Math.max(maxSalary, salary);
            // if (maxSalary < salary) maxSalary = salary;
        }

        System.out.printf("%.2f", maxSalary);
    }

}
