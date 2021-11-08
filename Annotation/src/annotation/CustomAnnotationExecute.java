package annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.lang.annotation.*;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute
{
	int Sequence();
}
class MyClass 
{
	@Execute(Sequence = 2)
	public void myMethod1() {
		System.out.println("Method 1 should be displayed second");
	}
	
	@Execute(Sequence = 1)
	public void myMethod2() {
		System.out.println("Method 2 should be displayed first");
	}
	
	@Execute(Sequence = 3)
	public void myMethod3() {
		System.out.println("Method 3 should be displayed third");
	}
}
public class CustomAnnotationExecute{
public static void main(String[] args) throws NoSuchMethodException, SecurityException 
{
	MyClass obj =new MyClass();
	
	Method m1=obj.getClass().getMethod("myMethod1");
	Annotation an1 = m1.getAnnotation(Execute.class);
	Execute e1=(Execute)an1;
	
	
	Method m2=obj.getClass().getMethod("myMethod2");
	Method m3=obj.getClass().getMethod("myMethod3");

	
	Annotation an2 = m2.getAnnotation(Execute.class);
	Annotation an3 = m3.getAnnotation(Execute.class);
	
	Execute e2=(Execute)an2;
	Execute e3=(Execute)an3;
	System.out.println("Method 1 Seq: "+e1.Sequence()+"\nMethod 2 Seq: "+e2.Sequence()+"\nMethod 3 Seq: "+e3.Sequence());
	
}
}