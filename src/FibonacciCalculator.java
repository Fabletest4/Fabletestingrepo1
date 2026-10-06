import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciCalculator {
    public static BigInteger fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The index must be non-negative.");
        }

        BigInteger previous = BigInteger.ZERO;
        BigInteger current = BigInteger.ONE;

        for (int i = 0; i < n; i++) {
            BigInteger next = previous.add(current);
            previous = current;
            current = next;
        }

        return previous;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a non-negative Fibonacci index: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a non-negative whole number.");
                return;
            }

            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Please enter a non-negative whole number.");
                return;
            }

            System.out.println("Fibonacci number at index " + n + ": " + fibonacci(n));
        }
    }
}
