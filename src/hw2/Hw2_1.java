package hw2;

import java.util.Scanner;

public class Hw2_1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника ");
        int a = scanner.nextInt();
        System.out.print("Введите ширину прямоугольника ");
        int b = scanner.nextInt();
        int perimetr = 2*(a+b);
        System.out.println("Периметр прямоугольника равен" + perimetr);
        scanner.close();

    }
}
