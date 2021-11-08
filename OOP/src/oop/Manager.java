package oop;
public class Manager extends Employee{
	double c;
	public Manager(int a, String b, double c) {
		super(a, b, c);
		this.c=c;	
	}
	public void salary_calc(int incentive) {
		double sal = c+incentive;
		System.out.println("Manager's Salary is:"+sal);
	}
}