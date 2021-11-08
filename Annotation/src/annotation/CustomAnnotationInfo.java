package annotation;
import java.lang.reflect.Method;
import java.lang.annotation.*;
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Info
{
int AuthorID();
String Author() default "";
String Supervisor() default "";
String Date();
String Time();
int Version();
String Description() default "";
}

@Info(AuthorID=1,Author="Mru",Date="05/11/2021",Time="08:00",Version=15,Description="Custom Annotations Class")
class Demo
{
@Info(AuthorID=1,Author="Mrunal",Date="06/11/2021",Time="09:00",Version=15,Description="Custom Annotations Method")
public void method1() 
{
System.out.println("Inside Demo.method1");
}
}
public class CustomAnnotationInfo 
{
public static void main(String[] args) throws NoSuchMethodException, SecurityException 
{

		Demo obj = new Demo();
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(Info.class);
		Info i = (Info)an;
		System.out.println("Annotation on Class\n");
		System.out.println("AuthorID:"+i.AuthorID()); 
		System.out.println("Author:"+i.Author()); 
		System.out.println("Supervisor:"+i.Supervisor()); 
		System.out.println("Date:"+i.Date()); 
		System.out.println("Time:"+i.Time()); 
		System.out.println("Version:"+i.Version()); 
		System.out.println("Description:"+i.Description());
		
		Method m = obj.getClass().getMethod("method1");
		Annotation an1= m.getAnnotation(Info.class);
		Info i1 = (Info)an1;
		System.out.println("\nAnnotation on Method\n");
		System.out.println("AuthorID:"+i1.AuthorID()); 
		System.out.println("Author:"+i1.Author()); 
		System.out.println("Supervisor:"+i1.Supervisor()); 
		System.out.println("Date:"+i1.Date()); 
		System.out.println("Time:"+i1.Time()); 
		System.out.println("Version:"+i1.Version()); 
		System.out.println("Description:"+i1.Description());
	}
}