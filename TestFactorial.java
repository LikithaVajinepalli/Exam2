public class TestFactorial {

    private static void check(boolean condition, String message) {
        if (!condition) {
            System.out.println("Test FAILED: " + message);
            System.exit(1);   
        }
        System.out.println("Test passed: " + message);
    }

    public static void main(String[] args) {
        check(Factorial.factorial(0) == 1, "factorial(0) == 1");
        check(Factorial.factorial(3) == 6, "factorial(3) == 6");
        check(Factorial.factorial(5) == 120, "factorial(5) == 120");

        try {
            Factorial.factorial(-1);
            check(false, "factorial(-1) should throw an exception");
        } catch (IllegalArgumentException e) {
            System.out.println("Test passed: factorial(-1) throws IllegalArgumentException");
        }
    }
}
