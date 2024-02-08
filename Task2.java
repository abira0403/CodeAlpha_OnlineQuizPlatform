import java.util.Scanner;

public class Task2 
{
    private static double balance = 0;
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) 
    {
        while (true) 
        {
        	System.out.println();
            System.out.println("1. Deposit        2. Withdraw");
            System.out.println("3. Check Balance        4. Exit");
            System.out.print("Enter your choice : ");
            
            int choice = in.nextInt();
            
            switch (choice) 
            {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("\nExiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    private static void deposit() 
    {
        System.out.print("\nEnter the amount to deposit: ");
        double amount = in.nextDouble();
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } 
        else 
        {
            System.out.println("Invalid amount. Please try again.");
        }
    }

    private static void withdraw()
    {
        System.out.print("\nEnter the amount to withdraw: ");
        double amount = in.nextDouble();
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("To check balance choose option 3.");
        } 
        else
        {
            System.out.println("Invalid amount or insufficient funds. Please try again !");
        }
    }

    private static void checkBalance() 
    {
        System.out.println("\nYour current balance is: " + balance);
    }
}
