package lambda;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functional 
{
public static void main(String[] args) 
{
String[] str = {"Mrunal", "Arjun","Yash"};
Supplier<String> supplier = ()-> Arrays.toString(str) ;        
System.out.println("Supplier:"+supplier.get()); 

Consumer<String[]> consumer = (string) -> System.out.println("Consumer:"+Arrays.toString(string));         
consumer.accept(str);  

Predicate<String[]> predicate = (string) -> Arrays.toString(string).contains("Mrunal");     
System.out.println("Predicate:"+predicate.test(str)); 

Function<String[], String> function = (string) -> Arrays.toString(string);               
System.out.println("Function:"+function.apply(str));                                                  
}
}