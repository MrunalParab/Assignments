package lambda;
import java.util.*;
public class ArithmeticOperations 
{
public static void main(String[] args) 
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.print("Enter 1st number:");
a=sc.nextInt();
System.out.print("Enter 2nd number:");
b=sc.nextInt();

Arithmetic add = (c,d) -> System.out.println("Addition : " + (c+d));
Arithmetic subtract = (c,d) -> System.out.println("Subtraction : " + (c-d));
Arithmetic multiply = (c,d) -> System.out.println("Multiplication : " + (c*d));
Arithmetic division = (c,d) -> System.out.println("Division : " + (c/d));

add.calculation(a, b);
subtract.calculation(a, b);
multiply.calculation(a, b);
division.calculation(a, b);
}
}
interface Arithmetic
{
public void calculation(int a,int b);
}
