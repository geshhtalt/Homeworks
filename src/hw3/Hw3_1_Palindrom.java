package hw3;

import java.util.Scanner;

public class Hw3_1_Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
       char[] number2 = (number +"").toCharArray();

        for (int i = 0; i < number2.length/2; i++) {
            if(number2[i] != number2[number2.length-1-i]){
                System.out.print("Слово не является палиндромом");
                scanner.close();
                return;
            }
        }
        System.out.print("Слово является палиндромом");
        scanner.close();

    }
}
