package basicdatastructure;
import java.util.*;
class Result
{
public static void main(String args[])
{
int sub1,sub2,sub3;
Scanner sc=new Scanner(System.in);
System.out.print("Enter marks for subject 1:");
sub1=sc.nextInt();
System.out.print("Enter marks for subject 2:");
sub2=sc.nextInt();
System.out.print("Enter marks for subject 3:");
sub3=sc.nextInt();

if (sub1 < 0 || sub1 > 100)
	System.out.println("Result:Invalid Marks");
else if (sub2 < 0 || sub2 > 100)
	System.out.println("Result:Invalid Marks");
else if (sub3 < 0 || sub3 > 100)
	System.out.println("Result:Invalid Marks");
else if ( (sub1 > 60) & (sub2 > 60) & ( sub3 > 60))
	System.out.println("Result:Passed");
else if ( (sub1 < 60) & (sub2 > 60) & ( sub3 > 60))
	System.out.println("Result:Promoted");
else if ( (sub1 > 60) & (sub2 < 60) & ( sub3 > 60))
	System.out.println("Result:Promoted");
else if ( (sub1 > 60) & (sub2 > 60) & ( sub3 < 60))
	System.out.println("Result:Promoted");
else if ( (sub1 > 60) & (sub2 < 60) & ( sub3 < 60))
	System.out.println("Result:Failed");
else if ( (sub1 < 60) & (sub2 > 60) & ( sub3 < 60))
	System.out.println("Result:Failed");
else if ( (sub1 < 60) & (sub2 < 60) & ( sub3 > 60))
	System.out.println("Result:Failed");
else  
	System.out.println("Result:Failed");
}
}