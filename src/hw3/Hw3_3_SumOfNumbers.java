package hw3;

import java.util.Scanner;

public class Hw3_3_SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 10) {
            sum += number % 10;
            number = number / 10;
            if(number < 10){
                sum += number;
                if(sum > 10){
                    number = sum;
                    sum = 0;
                }
            }
        }

        System.out.print("Сумма чисел равна " + sum);
    }
}
