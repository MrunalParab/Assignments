package annotation;
import java.lang.annotation.*;  
import java.lang.reflect.*;  
 @Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{
String TestCase() ;
}
class test1
{	
 @Test(TestCase = "Custom Annotation @Test")
public void Hello()
{
System.out.println("Lets try annotation");
}  
}
public class CustomAnnotationTest 
{
public static void main(String[] args) throws Exception 
{
test1 t = new test1();
Method annot = t.getClass().getMethod("Hello");
Annotation annotation = annot.getAnnotation(Test.class);
Test ts = (Test)annotation;
System.out.println( ts.TestCase());
}	
}