public class Main {

    // Задание 1: Функция для проверки, можно ли составить треугольник
    public static boolean triangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Задание 2: Функция для вычисления расстояния между двумя точками
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Задание 3: Функция для вычисления a^n с помощью цикла
    public static double powerLoop(double a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Степень не может быть отрицательной.");
        }
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }

    // Задание 4: Функция для вычисления a^n рекурсивно
    public static double power(double a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Степень не может быть отрицательной.");
        }
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

    // Задание 5: Функция для вычисления n-го числа Трибоначчи
    public static int tribonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Индекс не может быть отрицательным.");
        }
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    public static void main(String[] args) {
        // Тестирование задания 1
        System.out.println("Задание 1: Треугольник");
        System.out.println(triangle(3, 4, 5)); // true
        System.out.println(triangle(1, 1, 3)); // false

        // Тестирование задания 2
        System.out.println("Задание 2: Расстояние");
        System.out.println(distance(1, 1, 4, 5));

        // Тестирование задания 3
        System.out.println("Задание 3: Возведение в степень с помощью цикла");
        System.out.println(powerLoop(2, 3));
        try {
            System.out.println(powerLoop(2, -2)); // должно выбросить исключение
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Тестирование задания 4
        System.out.println("Задание 4: Возведение в степень рекурсивно");
        System.out.println(power(2, 3));
        try {
            System.out.println(power(2, -2)); // должно выбросить исключение
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Тестирование задания 5
        System.out.println("Задание 5: Ряд Трибоначчи");
        for (int i = 0; i < 10; i++) {
            System.out.print(tribonacci(i) + " "); // 0 0 1 1 2 4 7 13 24 44
        }
        System.out.println();
        try {
            System.out.println(tribonacci(-1)); // должно выбросить исключение
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}