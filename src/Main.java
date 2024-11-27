import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        for (int l = 0; l <= 10; l++) {
            System.out.println(l);
        }
        System.out.println("Задача 2");
        for (int r = 10; r >= 1; r--) {
            System.out.println(r);
        }
        System.out.println("Задача 3");
        for (int y = 0; y <= 17; y = y + 2) {
            System.out.println(y);
        }
        System.out.println("Задача 4");
        for (int n = 10; n >= -10; n--) {
            System.out.println(n);
        }
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным ");
        }
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Задача 7");

        for (int h = 1; h <= 512; h = h * 2) {
            System.out.println(h);
        }
        System.out.println("Задача 8");
        int can = 29000;
        int total = 0;
        int k;
        for (k = 1; k <= 12; k++) {
            total = total + can;

            System.out.println("Месяц " + k + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 9");
        int total2 = 0;

        for (k = 1; k <= 12; k++) {
            total2 += total2 * 0.01;
            total2 = total2 + can;
            System.out.println("Месяц " + k + " сумма накоплений равна " + total2 + " рублей");
        }

        System.out.println("Задача 10");
        int e = 2;

        for (int f = 1; f <= 10; f++) {
            System.out.println("2*" + f + "=" + (f * 2));

        }


    }
}