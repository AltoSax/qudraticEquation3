package programm;

import java.util.Scanner;

/**
 * Created by Savva Avdysho on 19.08.2016.
 */

public class Programm {
    public static void main(String[] args) {
        /* double a = 0;
        double b = 19;
        float c = 7; */
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextInt();
        System.out.print("b = ");
        double b = scanner.nextInt();
        System.out.print("c = ");
        float c = scanner.nextInt();
        scanner.close();
        if (a != 0) {
            double d = Math.pow(b, 2) - 4 * a * c;
            if (d < 0) {
                System.out.println("Корней нет!");
            } else {
                if (d > 0) {
                    double x1 = (-b + Math.sqrt(d)) / (2 * a);
                    double x2 = (-b - Math.sqrt(d)) / (2 * a);
                    System.out.println(x1 + "\n" + x2); // (\n) - символ перехода на новую строку
                }
                if (d == 0) {
                    double x1 = -b / (2 * a);
                    System.out.println(x1);
                }
            }
        }
        else{
            double x1 = -c / b;
            System.out.println(x1);
        }
    }
}
