package hw2;

import java.util.Scanner;

public class Hw2_22StudentScoreJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку");
        int grade = scanner.nextInt();
        String score;
        if (90 <= grade && grade <= 100) {
            score = "A";
        } else if (grade >= 75 && grade <= 89) {
            score = "B";
        } else if (grade >= 50 && grade <= 74) {
            score = "C";
        } else if (grade >= 30 && grade <= 49) {
            score = "D";
        } else if (grade >= 0 && grade <= 29){
            score ="F";
        }
        else {
            score = "Некорректная оценка";
        }
        System.out.print(score);


    }

}
