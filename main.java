import java.util.Scanner;

public class main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double balance = 10.09;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("BANKING SYS");
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
                case 2 -> System.out.println("DEPOSIT");
                case 3 -> System.out.println("WITHDRAW");
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }


        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("_________________");
        System.out.println("Your balance: $"+ balance);
    }
    static double deposit(double balance) {
        double amount;

        System.out.println("Enter an amount to be deposited: ");

        return 0;
    }
}
