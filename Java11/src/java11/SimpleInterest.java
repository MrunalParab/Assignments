package java11;
public class SimpleInterest 
{
	public static void main(String[] args) 
	{
		var Principal=10000;
		var Rate=6;
		var Time=3;
		CalculateSI obj = (var a,var b,var c) -> (a*b*c)/100;
		System.out.println(obj.sI(Principal, Rate, Time));
	}
}

interface CalculateSI
{
	double sI(double P,double R,double T);
}