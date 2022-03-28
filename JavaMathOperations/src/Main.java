public class Main {
    public static int modulo(int a, int b){
	return a%b;
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        sum(a, b);
	    modulo(a,b);
//        System.out.println(a+b);
        System.out.println(a*b);
    }
}
