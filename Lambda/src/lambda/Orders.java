package lambda;
import java.util.*;
import java.util.stream.Stream;   

class Order
{   
    String status;  
    int price;  
    public Order( String status, int price) 
    {   
    	this.status = status;  
    	this.price = price;  
    }                                                               
}  
public class Orders 
{
public static void main(String[] args) 
{  
        List<Order> list=new ArrayList<Order>();  
        list.add(new Order("Order Status:Accepted",270000));  
        list.add(new Order("Order Status:Completed",60000));  
        list.add(new Order("Order Status:Accepted",500000));  
        list.add(new Order("Order Status:Processing",2500));  
        list.add(new Order("Order Status:Accepted",150000));  
        list.add(new Order("Order Status:Completed",55000));  
        list.add(new Order("Order Status:Processing",6500));  
      
        Stream<Order> filtered_data = list.stream().filter(p -> p.price > 10000 && p.status.startsWith("Order Status:Accepted") 
        		|| p.status.startsWith("Order Status:Completed"));  
        filtered_data.forEach(Orders -> System.out.println("Order Price is "+Orders.price+ " & "+Orders.status));  
    }  
}  
