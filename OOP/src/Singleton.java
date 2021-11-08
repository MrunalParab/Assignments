class Test
{
	private static Test s=null;
	public String str;
	private Test()
	{
		str="Singleton Class";
	}
	public static Test getInstance()
	{
		if(s==null)
		{
			s=new Test();
		}
		return s;
	}
}
class Singleton
{
	public static void main(String args[])
	{
		Test a= Test.getInstance();
		Test b=Test.getInstance();
		a.str=(a.str).toUpperCase();
		System.out.println("String-a:"+a.str);
		System.out.println("String-b:"+b.str);
		System.out.println("Hence,proved.");
	}
}

