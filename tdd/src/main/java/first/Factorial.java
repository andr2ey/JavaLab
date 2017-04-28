package first;

public class Factorial {

    public static int compute(int n) {
        if (n < 0)
            throw new ArithmeticException();
        return factorial(n);
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        return n*compute(n-1);
    }

    public static void main(String[] args) {
        System.out.printf("Nothing");
    }
}
