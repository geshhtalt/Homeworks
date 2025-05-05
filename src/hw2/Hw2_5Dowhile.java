package hw2;

import java.util.Scanner;

public class Hw2_5Dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Введите число");
            number = scanner.nextInt();
        } while (number >= 0);
        System.out.println("Цикл завершен");
        scanner.close();
    }

}
