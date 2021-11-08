package oop;
public class Organization {
	public static void main(String args[]) {
		Manager m = new Manager(123,"Mrunal",70000);
		m.salary_calc(5000);
		Labour l=new Labour(145,"Abc",10000);
		l.salary_calc(300);
	}
}


