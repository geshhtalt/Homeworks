package hw2;

import java.util.Scanner;

public class Hw2_3Tablitca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для таблицы умножения");
        int n = scanner.nextInt();
        System.out.println("Таблица умножения" + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }
        scanner.close();
    }

}
