package SecondLesson;

public class AnotherSecond {

    int arg1, arg2;

    public static void main(String[] args) {
        System.out.println("Примеры арифметических выражений");
        long summa = summa(9, 3);
        long result1 = 9 + 3;
        System.out.println(summa);

        long minus = minus(9, 3);
        long result2 = 9 - 3;
        System.out.println(minus);

        long division = division(9, 3);
        long result3 = 9 / 3;
        System.out.println(division);

        long multiply = multiply(9, 3);
        long result4 = 9 * 3;
        System.out.println(multiply);
    }

    public static long summa(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static long division(int arg1, int arg2) {
        return arg1 / arg2;
    }

    public static long multiply(long arg1, long arg2) {
        return arg1 * arg2;
    }
}

