package oop;
public class Labour extends Employee {
	double c;
	public Labour(int a, String b, double c) {
		super(a, b, c);
		this.c=c;
	}
	public void salary_calc(int overtime) {
		double sal = c+overtime;
		System.out.println("Labour's Salary is : "+sal);
	}
}
