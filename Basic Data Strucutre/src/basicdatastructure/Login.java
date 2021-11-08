package basicdatastructure;
import java.util.*;
public class Login 
{
public static void main(String[] args) 
{
int attempt=3,temp=attempt;
Scanner sc = new Scanner(System.in);
String uname="Mrunal";
String pass="Mrunal@22";
for(int i=1;i<=temp;i++)
{
System.out.println("Enter the Username:");
String lname = sc.nextLine();
System.out.println("Enter the Password:");
String upass = sc.nextLine();
if(uname.equals(lname) && pass.equals(upass))
{
	System.out.println("Welcome "+lname);
	break;
}
else
{
System.out.println("Login failed");
attempt--;
System.out.println("Total attempts left:"+attempt);
}
if(attempt==0)
{
System.out.println("Contact Admin");
}
}
}
}
