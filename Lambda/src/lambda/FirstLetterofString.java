package lambda;
import java.util.*;
import java.util.function.Function;
public class FirstLetterofString 
{
public static void main(String[] args) 
{
List<String> str = Arrays.asList("Mrunal", "Arjun","Yash");
Function<List<String>,List<String>> function = (string) -> {List<String> stringList = new ArrayList<String>();
for (String s : string) 
{
stringList.add(""+s.charAt(0));
}  
return stringList;
};
System.out.println(function.apply(str));	
}
}

