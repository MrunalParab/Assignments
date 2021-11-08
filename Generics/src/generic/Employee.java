package generic;
class Employee 
{
int id,salary;
String name,department;
public Employee(int id,String name,String department,int salary)
{
	this.id=id;
	this.name=name;
	this.department=department;
	this.salary=salary;
}
public void detailsDisplay()
{
	System.out.println("Emp id:"+id);
	System.out.println("Emp name:"+name);
	System.out.println("Emp department:"+department);
	System.out.println("Emp salary:"+salary);
}
}
