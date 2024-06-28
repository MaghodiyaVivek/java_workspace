package javaprogram;

/*W.A.J.P to create a custom exception if Customer withdraw amount which is greater than account balance then program will show custom exception otherwise amount
will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 2500
Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.   */

import java.util.Scanner;

public class Program41 
{
    private int balance;

    public Program41(int balance) 
    {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException 
    {
        if (amount > balance) 
        {
            int deficit = amount - balance;
            throw new InsufficientBalanceException();
        } else 
        {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) 
    {
        Program41 account = new Program41(2000);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter withdraw amount: ");
        int amount = scanner.nextInt();

        try 
        {
            account.withdraw(amount);
        } 
        catch (InsufficientBalanceException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
