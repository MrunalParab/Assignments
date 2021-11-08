package exception;
import java.util.Scanner;
public class Withdraw 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
SavingAccount Account = new SavingAccount();
Account.show();
System.out.println("Enter amount to withdraw:");
double amount = sc.nextDouble();
try 
{
Account.withDraw(amount);
} 
catch (InSufficientBalanceException e) 
{
System.out.println("Error : " + e.getMessage());
}
catch (IllegalBankTransactionException e) 
{
System.out.println("Error : " + e.getMessage());
}
Account.show();
}
}
