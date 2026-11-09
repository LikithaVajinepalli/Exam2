public class Testfactorial {
    public static void main(String[] args) {
        try {
            System.out.println("factorial(0) = " + Factorial.factorial(0));
            System.out.println("factorial(5) = " + Factorial.factorial(5));
            System.out.println("factorial(-1) = " + Factorial.factorial(-1));
        } catch (IllegalArgumentException e) {
            System.out.println("The number is not satisfied : " + e.getMessage());
        }
    }
}
