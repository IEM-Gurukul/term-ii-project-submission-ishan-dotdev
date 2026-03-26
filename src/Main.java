// Updated version 1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankManager manager = new BankManager();

        while (true) {
            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            int choice = Integer.parseInt(sc.next());

            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = sc.next();
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();
                System.out.print("Enter Initial Balance: ");
                double bal = sc.nextDouble();

                BankAccount acc = new BankAccount(name, accNo, bal);
                manager.addAccount(acc);

                System.out.println("Account Created!");

            } else if (choice == 2) {
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();
                BankAccount acc = manager.findAccount(accNo);

                if (acc != null) {
                    System.out.print("Enter Amount: ");
                    double amt = sc.nextDouble();
                    acc.deposit(amt);
                } else {
                    System.out.println("Account not found");
                }

            } else if (choice == 3) {
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();
                BankAccount acc = manager.findAccount(accNo);

                if (acc != null) {
                    System.out.print("Enter Amount: ");
                    double amt = sc.nextDouble();
                    acc.withdraw(amt);
                } else {
                    System.out.println("Account not found");
                }

            } else if (choice == 4) {
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();
                BankAccount acc = manager.findAccount(accNo);

                if (acc != null) {
                    acc.display();
                } else {
                    System.out.println("Account not found");
                }

            } else {
                break;
            }
        }
    }
}
// Final submission version