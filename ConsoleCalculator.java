import java.util.Scanner;

public class ConsoleCalculator {
    private static boolean continuePlaying = true;
    private static final Scanner scanner = new Scanner(System.in);

    public int getUserChoice() {
            System.out.println("\n1. Add\n" +
                    "2. Subtract\n" +
                    "3. Multiply\n" +
                    "4. Divide\n" +
                    "5. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            return choice;
    }

    public void processUserDemand(int choice) {
        if (choice >= 1 && choice <= 4) {
            System.out.print("Enter two numbers: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            if (choice == 1) {
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, (num1 + num2));
            } else if (choice == 2) {
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, (num1 - num2));
            } else if (choice == 3) {
                System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, (num1 * num2));
            } else if (choice == 4) {
                if (num2 == 0) System.out.println("Error: Division by zero");
                else System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, (num1 / num2));
            }
        } else if (choice == 5) {
        continuePlaying = false;
        System.out.println("Thanks! Have a great day!");
    } else {
        System.out.println("Invalid input!");
    }
    }

    public static void main(String[] args) {
        ConsoleCalculator sc = new ConsoleCalculator();
        while (continuePlaying) {
            sc.processUserDemand(sc.getUserChoice());
        }
        scanner.close();
    }
}
