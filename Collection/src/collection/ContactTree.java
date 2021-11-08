package collection;
import java.util.TreeMap;
class Contact
{
long PhoneNumber;
String Name;
String Email;
String Gender;	
public Contact(long phoneNumber, String name, String email, String gender) 
{
super();
PhoneNumber = phoneNumber;
Name = name;
Email = email;
Gender = gender;
}	
@Override
public String toString() 
{
return "[Number=" + PhoneNumber + ", Name=" + Name + ", Email=" + Email + ", Gender=" + Gender + "]" + "\n";	
}
}
public class ContactTree 
{
public static void main(String[] args) 
{
Contact obj1 = new Contact( 9930697398L, "Mrunal" , "mru@gmail.com" , "Female");
Contact obj2 = new Contact( 8876543901L, "Siddhi" , "sid@gmail.com" , "Female");
Contact obj3 = new Contact( 9967235410L, "Kavish" , "kav@gmail.com" , "Male");
TreeMap < Long , Contact> tr = new TreeMap<Long , Contact>();
tr.put(8108764545L, obj1);
tr.put(877991234L, obj2);
tr.put(8655454545L, obj3);
System.out.println("Fetching all the keys");
for(Long intk : tr.keySet())
{
System.out.println(intk);
}
System.out.println("Fetching all the Values");
for (Contact strV : tr.values())
{
System.out.println(strV);
}
System.out.println("Printing all the Key-Values pairs:"+ tr);
}
}
