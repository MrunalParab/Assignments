package generic;
import java.util.*;
public class HashSetEmp 
{
public static void main(String[] args) 
{
Employee E1=new Employee(1,"Mrunal","IT",50000);
Employee E2=new Employee(2,"Siddhi","HR",40000);
HashSet<Employee> emp=new HashSet<>();
emp.add(E1);
emp.add(E2);
Iterator<Employee> iterate=emp.iterator();
while(iterate.hasNext())
{
	iterate.next().detailsDisplay();
	System.out.println();
}
}

}
