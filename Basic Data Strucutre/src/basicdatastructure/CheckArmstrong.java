package basicdatastructure;
import java.util.*;
public class CheckArmstrong
{
public static void main(String[] args)
{
System.out.print("Armstrong numbers from 100 to 999 are:");
for(int i=100;i<1000;i++)
{
int n=i,rev=0,rem=0;
while(n>0)
{
rem=n%10;
rev=rev+(rem*rem*rem);
n=n/10;
}
if(rev==i)
{
System.out.print(i+" ");
}
}
}
}