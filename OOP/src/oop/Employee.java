package oop;
public class Employee {
	int id,incentive,overtime;
	String name;
	double base_salary;
	public Employee(int a,String b,double c) {
		this.id=a;
		this.name=b;
		this.base_salary=c;
	}
	public void salary() {
		double sal=base_salary;
		System.out.println("Base salary is:"+sal);
	}
}
