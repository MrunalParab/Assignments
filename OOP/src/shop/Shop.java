package shop;
import java.util.*;
public class Shop 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
Dessertshop candy = new Candy();
Dessertshop cookies = new Cookies();
Dessertshop iceCream = new Icecream();
Owner owner = new Owner();
Customer customer = new Customer();
Boolean isTrue = true;
while(isTrue) 
{
System.out.println("\n\nOwner or Customer");
System.out.println("Press 1 for Owner, Press 2 for Customer and 0 to exit");
int key = sc.nextInt();
if(key == 1) 
{
System.out.println("\n"+"Owner:");
owner.addDessert(candy, cookies, iceCream);	
}
else if(key == 2)
{	
customer.placeOrder(candy, cookies, iceCream);
}
else if(key == 0)
{
int num = sc.nextInt();
if (num == 1) 
{
isTrue = false;
}
}	
}
sc.close();
}
}