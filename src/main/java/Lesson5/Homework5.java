package Lesson5;

import java.util.Scanner;

public class Homework5 {

    public static void main(String[] args) {

        int maxNumber = 0;
        int previosNumber = 1;
        int nextNumber = 1;

        System.out.println("Введите количество чисел последовательности :");
        Scanner scanner = new Scanner(System.in);
        maxNumber = scanner.nextInt();
        System.out.print("Последовательность Фибоначчи из "+maxNumber+" чисел :");

        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previosNumber+" ");

            int sum = previosNumber + nextNumber;
            previosNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
