package exception;
public class SavingAccount 
{
long loginID= 123;
double balance =2000;
public void show() 
{
System.out.println("LoginId : " + loginID + "\n" + "Balance : " + balance);
}
public void withDraw(double amount) throws IllegalBankTransactionException,InSufficientBalanceException
{
if( balance < amount || balance==0) 
{
throw new InSufficientBalanceException("Insufficient Balance");
}
else if (amount<0) 
{
throw new IllegalBankTransactionException("Illegal Bank Transaction Exception");
}
else 
{
balance -= amount;
System.out.println("Your money:" + amount);
}
}
}
