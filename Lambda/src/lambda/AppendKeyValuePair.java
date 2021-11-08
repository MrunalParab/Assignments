package lambda;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
public class AppendKeyValuePair 
{
public static void main(String[] args) 
{
Map<Integer, String> map = new HashMap<>();
map.put(1, "Mrunal");
map.put(2, "Onkar");
Function<Map<Integer, String>, StringBuilder> function = mapValues -> 
{StringBuilder sb = new StringBuilder();
	for (Entry<Integer, String> string : mapValues.entrySet()) 
	{
				sb.append(string.getKey());
				sb.append(string.getValue());
	}
	return sb;
};
System.out.println("Key-Value Pair:"+"\n"+function.apply(map));
}
}