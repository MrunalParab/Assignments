import java.util.*;
//import java.util.stream.Collectors;
class Trader
{
String name,city;
public Trader(String name,String city) 
{
	this.name=name;
	this.city=city;
}
}
public class ExampleStream 
{
public static void main(String args[]) 
{
List<Trader> traderslist=new ArrayList<Trader>();
traderslist.add(new Trader("Mrunal","Mumbai"));
traderslist.add(new Trader("Raj","Indore"));
traderslist.add(new Trader("Siddhi","Pune"));
traderslist.add(new Trader("Rahul","Indore"));
traderslist.stream()  
.filter(Trader -> Trader.city == "Indore")  
.forEach(Trader -> System.out.println(Trader.name)); 
}
}