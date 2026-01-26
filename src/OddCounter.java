import java.util.Scanner;

public class OddCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        int count = 0;

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number % 2 != 0) {
                count++;
            }
        }

        System.out.println("Number of odd numbers: " + count);
        scanner.close();
    }
}