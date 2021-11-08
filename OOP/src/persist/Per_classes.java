package persist;
public class Per_classes 
{
	
}
abstract class persist
{
	abstract void per();
}
class filepersistence extends persist
{
	@Override
	void per() 
	{
		System.out.println("Executing File Persistence.");
		
	}
	
}
class databasepersistence extends persist
{
	void per() 
	{
		System.out.println("Executing Database Persistence.");
	}
}
