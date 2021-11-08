package basicdatastructure;
import java.util.*; 
public class Arraysearch
{
public static void main(String[] args) 
{ 
Scanner sc = new Scanner(System.in);
int i, j=0, flag=0, x;
System.out.println("Enter array elements:");
int Arr[] = new int[15]; 
for( i = 0; i < Arr.length; i++) 
Arr[i] = sc.nextInt(); 
System.out.println("Enter the element you want to find: ");
x = sc.nextInt();
for( j = 0; j < Arr.length; j++)
{
if(Arr[j] == x)
{
flag = 1;
break;
}
else
{
flag = 0;
}
}
if(flag == 1)
{
System.out.println("Element found at position:"+(j + 1));
}
else
{
System.out.println("Element not found");
}
} 
}
