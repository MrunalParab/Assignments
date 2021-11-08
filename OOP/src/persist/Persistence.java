package persist;
public class Persistence
{
public static void main(String args[]) 
{
	persist p = new filepersistence();
	p.per();
	persist p1=new databasepersistence();
	p1.per();
}
}

