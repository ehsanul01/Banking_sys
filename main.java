import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 10.09;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("\nBANKING SYS");
            System.out.println("___^^^____^^^____");
            System.out.println("-_-_-_-_-_-_-_-_-");
            System.out.println("_________________");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("_________________");

            System.out.print("Enter Your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }
        System.out.println("Thank you for using Banking System");

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Your balance: $%.2f%n", balance);
    }

    static double deposit() {
        System.out.print("Enter an amount to be deposited: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid Amount");
            return 0;
        } else {
            System.out.printf("Successfully deposited: $%.2f%n", amount);
            return amount;
        }
    }

    static double withdraw(double amount) {
        System.out.print("Enter an amount to be withdrawn: ");
        double amountWithdraw = scanner.nextDouble();

        if (amountWithdraw > amount) {
            System.out.println("INSUFFICIENT Amount");
            return 0;
        }
        else if (amountWithdraw <= 0) {
            System.out.println("Amount can't be negative or zero");
            return 0;
        } else {
            return amountWithdraw;
        }
    }
}
