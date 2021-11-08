package string;
public class Indexing 
{
public static void main(String[] args) 
{
String str="It is used to _ at the specified index position";
String newstr="insert text";
int index=str.indexOf("_");
System.out.println("Index no:"+index);
System.out.println("Initial String:"+str);
System.out.println("Index where new string is to be added:"+index);
StringBuffer string=new StringBuffer(str);
string.deleteCharAt(index);
string.insert(index, newstr);
System.out.println("Result:"+string);
}
}
