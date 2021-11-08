package stream;
import java.util.*;
import java.util.stream.Collectors;
public class StreamDemo 
{
public static void main(String[] args) 
{
		List<Fruit> fruitList = Arrays.asList(
				new Fruit("Mango", 150 , 10, "Yellow"),
				new Fruit("Apple", 60 , 30, "Red"),
				new Fruit("Orange", 30 , 20, "Orange"),
				new Fruit("Banana", 50 , 50, "Yellow")
				);
		
		List<News> newsList = Arrays.asList(
				new News(1, "N1" , "I", "Hello"),
				new News(2, "N2" , "J", "budget"),
				new News(1, "N3" , "K", "budget"),
				new News(4, "N4" , "I", "Welcome")
				 
				); 

		List<Trader> traderList = Arrays.asList(
				new Trader("Siddhi", "Pune"),
				new Trader("Mrunal", "Mumbai"),
				new Trader("Yash", "Indore"),
				new Trader("Myra", "Delhi")
				);
		
		List<Transaction> transactionList = Arrays.asList(
				new Transaction(traderList.get(0), 2000, 1000),
				new Transaction(traderList.get(1), 2011, 8000),
				new Transaction(traderList.get(2), 2011, 3000),
				new Transaction(traderList.get(3), 2003, 6000)
				);
		
		
		// 1st Question
		System.out.println("Stream 1st Question output-Fruit names of low calories:");	
		fruitList.stream().filter(l -> l.calories<100).forEach(l -> System.out.println(l.name));
		
		// 2nd Question 
		System.out.println("\n"+"Stream 2nd Question output-Colorwise list of fruit names:");
		fruitList.stream().sorted(Comparator.comparing(l -> l.color)).forEach( l-> System.out.println(l));
		 
		//3rd Question
		System.out.println("\n"+"Stream 3rd Question output-Only red color fruits:");
		fruitList.stream().filter(l -> l.color=="Red").forEach(l -> System.out.println(l.name));;
		
		 //4th Question
		
		System.out.println("\n"+"Stream 4th Question output - news id with max content:");
		newsList.stream().collect(Collectors.groupingBy(l -> l.newsId, Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Map.Entry.comparingByValue())
	      .ifPresent(l-> System.out.println("News Id : "+ l.getKey() + " has the maxium comment i.e. :" + l.getValue()));
		 
		//5th Question
		System.out.println("\n"+"Stream 5th Question output-no. of times word 'budget' arrived:");
		newsList.stream().filter(l-> l.comment.equalsIgnoreCase("budget")).collect(Collectors.groupingBy(l -> l.comment, 
		Collectors.counting()))
	    .entrySet().stream().max(Map.Entry.comparingByValue())
	    .ifPresent(l-> System.out.println( l.getKey() + " arrived " + l.getValue() + " times")); 
		
		
		//6th Question
		System.out.println("\n"+"Stream 6th Question output:User that posted max contents:");
		newsList.stream().collect(Collectors.groupingBy(l->l.commentByUser, Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Map.Entry.comparingByValue())
	      .ifPresent(l-> System.out.println("User Id : "+ l.getKey() + " has did the maximum comment i.e. :" + l.getValue()));
		
		//7th Question
		System.out.println("\n"+"Stream 7th Question output:CommentByUser wise number of comments:");
		newsList.stream().collect(Collectors.groupingBy(l->l.commentByUser, Collectors.counting()))
		.entrySet().stream()
		.forEach(l -> System.out.println(l));

		// 8th Question
		System.out.println("\n"+"Stream 8th Question output Transactions in year 2011:");	
		transactionList.stream().filter(l -> l.year == 2011).sorted(Comparator.comparingInt(l-> l.value))
		.forEach(l -> System.out.println(l));
		
		//9th 
		System.out.println("\n"+"Stream 9th Question output-unique cities:");
		traderList.stream().map(l-> l.city.toLowerCase()).distinct().forEach(l -> System.out.println(l));
		
		// 10th Question
		System.out.println("\n"+"Stream 10th Question output-traders from Pune:");
		traderList.stream().filter(l -> l.city.equalsIgnoreCase("Pune")).sorted(Comparator.comparing(l -> l.name))
		.forEach(l -> System.out.println(l));
		
		//11th Question
		System.out.println("\n"+"Stream 11th Question output-Returns string of  traders name:");
		traderList.stream().sorted(Comparator.comparing(l -> l.name)).map(l -> l.name).forEach(System.out::println);
		
		//12th Question
		System.out.println("\n"+"Stream 12th Question output-Traders from Indore:");
		traderList.stream().filter(Trader -> Trader.city == "Indore").forEach(Trader -> System.out.println(Trader.name));
		
		//13th Question
		System.out.println("\n"+"Stream 13th Question output-transaction values from traders in Delhi:");
		transactionList.stream().filter(l-> l.trader.city.equalsIgnoreCase("Delhi")).forEach(System.out::println);
		
		//14th question
		System.out.println("\n"+"Stream 14th Question output-highest value of all the transactions:");
		transactionList.stream().max(Comparator.comparingInt(l-> l.value)).ifPresent(System.out::println);
		
		//15 Question
		System.out.println("\n"+"Stream 15th Question output-smallest value of all the transactions:");
		transactionList.stream().min(Comparator.comparingInt(l-> l.value)).ifPresent(System.out::println);
}	 
}
class Fruit
{
	String name;
	int calories;
	int price;
	String color;
	public Fruit(String name, int calories, int price, String color) 
	{
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() 
	{
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
}

class News
{
	int newsId;
	String postedByUser;
	String commentByUser;
	String comment;
	public News(int newsId, String postedByUser, String commentByUser, String comment) 
	{
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	@Override
	public String toString()
	{
		return "News[newsId="+newsId+",postedByUser="+postedByUser+", commentByUser="+commentByUser+",comment="+comment+"]";
	}
}

class Trader
{
	String name;
	String city;
	public Trader(String name, String city) 
	{
		super();
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() 
	{
		 
		return name+" "+ city;
	}	
}

class Transaction
{
	Trader trader;
	int year;
	int value;
	public Transaction(Trader trader, int year, int value) 
	{
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	@Override
	public String toString() 
	{
		  return trader +" "+year+ " " +value ;
	}	
}