package ThirdLesson;

import java.util.Scanner;

public class Formula {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите a:");
        double a = in.nextDouble();

        System.out.print("Введите b:");
        double b = in.nextDouble();

        System.out.println("Введите c:");
        double c = in.nextDouble();

        double d = (b * b - 4) * a * c;

        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения x1 =" + x1 + ", x2 = " + x2);
        }
        else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень : x =" + x);
        }
        else if (d < 0) {
            System.out.println("Уравнение не имеет действительных корней");
        }
    }

    private static void If() {
    }

}
