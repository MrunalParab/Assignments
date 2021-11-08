package bank;
import java.util.*;
public class Save extends Account 
{
	double cu1;
	public Save(int id, String name) 
	{
		super(id,name);
	}
	public void sav() {
		System.out.println("Enter the amount in savings :");
		Scanner sc= new Scanner(System.in);
		cu1=sc.nextDouble();
		sc.close();
	}
	public void disp() {
		System.out.println("The credentials are : "+id+" "+name);
	}
	public void total(int cu) {
		double tot1=cu1+cu;
		System.out.println("Total assets worth : "+tot1);
	}
}