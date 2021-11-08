package abstract_method;
public abstract class AbstractClass 
{ 
int x = 10; 
AbstractClass()
{ 
	System.out.println("Abstract Class "); 
} 
final void m1()
{ 
	 System.out.println("Final method"); 
} 
void m2()
{ 
	 System.out.println("Instance method"); 
} 
static void m3()
{ 
System.out.println("Static method"); 
} 
abstract void msg(); 
} 
