import java.util.Scanner;

public class Main {
    public static int modulo(int a, int b) {
        return a % b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }


    public static int substraction(int a, int b) {
        return a - b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        int a = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();

        System.out.println("a+b="+sum(a,b));
        System.out.println("a-b="+substraction(a,b));
        System.out.println("a*b="+multiply(a,b));
        System.out.println("a%b="+modulo(a,b));
    }
}
