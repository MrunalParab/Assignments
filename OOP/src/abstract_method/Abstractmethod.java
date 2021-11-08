package abstract_method;
public class Abstractmethod extends AbstractClass 
{ 
  Abstractmethod()
  { 
     System.out.println("Abstract Class Constructor"); 
   } 
 void msg()
 { 
    System.out.println("Hello Java"); 
 } 
public static void main(String[] args) 
{ 
	Abstractmethod t = new Abstractmethod(); 
    t.msg(); 
    t.m1(); 
    t.m2(); 
    m3(); 
   System.out.println("x = " +t.x); 
 } 
}