import java.util.Scanner;

public class BasicMathCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter choice (1: +, 2: -, 3: *, 4: /): ");
        int op = sc.nextInt();

        if (op == 1) {
            System.out.println("Result: " + (a + b));
        } else if (op == 2) {
            System.out.println("Result: " + (a - b));
        } else if (op == 3) {
            System.out.println("Result: " + (a * b));
        } else if (op == 4) {
            System.out.println("Result: " + (a / b));
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
