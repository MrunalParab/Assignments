import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Trans
{
	Trader trader;
	int year;
	int value;
	public Trans(Trader trader, int year, int value) 
	{
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	@Override
	public String toString()
	{
		return trader.name + " " +year+ " " +value;
	}
}
class Trader
{
	String name,city;
	public Trader(String name,String city) 
	{
		this.name=name;
		this.city=city;
	}
}

public class Transaction 
{
public static void main(String args[]) 
{
	List<Trader> traderslist=new ArrayList<Trader>();
	traderslist.add(new Trader("Mrunal","Mumbai"));
	traderslist.add(new Trader("Raj","Indore"));
	traderslist.add(new Trader("Siddhi","Pune"));
	traderslist.add(new Trader("Rahul","Indore"));
	List<Trans> transactionlist = new ArrayList<Trans>();
	transactionlist.add(new Trans(traderslist.get(0), 2000, 10000));
	transactionlist.add(new Trans(traderslist.get(1), 2011, 8000));
transactionlist.stream().max(Comparator.comparingInt(Trans-> Trans.value)).ifPresent(System.out::println);
}
}