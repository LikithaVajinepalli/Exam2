public class Factorial {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Give a number greater than or equal to zero");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("The factorial of number " + n + " is " + factorial(n));
    }
}
