package shop;
import java.util.*;
public class Customer 
{
int noOfCandy,noOfCookies,noOfIcecream;
public void placeOrder(Dessertshop candy , Dessertshop cookies , Dessertshop icecream) 
{
try (Scanner sc = new Scanner(System.in)) 
{
System.out.println("");
Boolean isTrue = true;
while(isTrue) 
{
System.out.println("Select your order :"+"\n"+ "1. candy(60rs)" +"\n"+"2. cookies(50)"
+"\n"+"3. icecream(70)"+"\n"+"Press 1 for candy, 2 for cookies, 3 for icecream"
+"\n");
int selected = sc.nextInt();
switch (selected) 
{
case 1: {
			System.out.println("Enter number of Candies to add : ");
			noOfCandy = sc.nextInt();
			cookies.numOfDesert -=  noOfCandy;
			break;
		}
case 2: {
			System.out.println("Enter number of Cookies to add : ");
			noOfCookies = sc.nextInt();
			cookies.numOfDesert -=  noOfCookies;
			break;
		}
case 3: {
			System.out.println("Enter number of Icecream to add : "); 
			noOfIcecream = sc.nextInt();
			icecream.numOfDesert -= noOfIcecream;  
			break;
		}
default:System.out.println("Select correct option");	
}
System.out.println("Enter 1 to continue and 0 to exit : ");
int num = sc.nextInt();
if (num == 0) 
{
isTrue = false;
}   	
}
}
System.out.println("Added successfully!!!");
showOrder(candy.getCost(), cookies.getCost(), icecream.getCost());
}

public void showOrder(int a, int b, int c) 
{
System.out.println("Your order is:" + "\n" + "Desserts    "+"Qty   " +"Amount"
+"\n"+"1. candy     "+noOfCandy+"     "+(a*noOfCandy)+"\n"+"2. Cookies   "+noOfCookies+"   "
+ " "+ "  "+(b*noOfCookies)+"\n"+"3. Icecream  "+noOfIcecream+"      " +(c*noOfIcecream)+"\n"+"-----------------------"
+"\n"+"Total bill"+" "+((a*noOfCandy)+(b*noOfCookies)+(c*noOfIcecream)));		
}
}
