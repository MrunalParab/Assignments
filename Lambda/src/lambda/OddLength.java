package lambda;
import java.util.*;
public class OddLength 
{
public static void main(String[] args) 
{
		List<String> str = new ArrayList<>();
			
		str.add("Mrunal");
		str.add("Komal");
		str.add("Manasi");
		str.add("Vinod");
		str.removeIf(l -> l.length()%2 !=0);
		System.out.println("String after removing odd length words:"+str);		
}
}


 