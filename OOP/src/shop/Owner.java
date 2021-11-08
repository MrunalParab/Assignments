package shop;
import java.util.*;
public class Owner 
{
public void addDessert(Dessertshop candy , Dessertshop cookies ,Dessertshop icecream ) 
{
try (Scanner sc = new Scanner(System.in)) 
{
System.out.println("Add Items ");
Boolean isTrue = true;
while(isTrue)
{
System.out.println("Enter number of Candy to add : ");
candy.numOfDesert +=  sc.nextInt();
System.out.println("Enter number of Cookies to add : ");
cookies.numOfDesert +=  sc.nextInt();
System.out.println("Enter number of Icecream to add : ");
icecream.numOfDesert +=  sc.nextInt();
System.out.println("Enter 1 to update more and 0 if completed : ");
int num = sc.nextInt();
if (num == 0) 
{
isTrue = false;
} 
System.out.println("Added successfully!!!");
}
}
}
}