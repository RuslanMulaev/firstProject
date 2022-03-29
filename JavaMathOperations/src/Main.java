import java.util.Scanner;


public class Main {
    //метод деление по модулью
    public static int modulo(int a, int b) {
        return a % b;
    }

    //метод вычясление суммы
    public static int sum(int a, int b) {
        return a + b;
    }

    //метод минус
    public static int substraction(int a, int b) {
        return a - b;
    }

    //метод умножения двух чисел
    public static int multiply(int a, int b) {
        return a * b;
    }

    //метод степени аналог (Math.pow)
    public static int pow(int a, int b) {
        int sum = 1;
        for (int i = 0; i < b; i++) {
            sum *= a;
        }
        return sum;
    }


    public static void main(String[] args) {
        //создаем новый сканнер
        Scanner in = new Scanner(System.in);
        //переменные которые хранят числа для вычисление
        System.out.print("a: ");
        int a = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();
        System.out.print("c: ");
        int c = in.nextInt();
        /////////NewNew

        //вызов методов
        System.out.println("a + b = " + sum(a, b));
        System.out.println("a - b = " + substraction(a, b));
        System.out.println("a * b = " + multiply(a, b));
        System.out.println("a % b = " + modulo(a, b));
        System.out.println("a ^ b = " + pow(a, b));
    }
}

// Life style
