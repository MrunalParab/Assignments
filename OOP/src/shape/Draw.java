package shape;
public abstract class Draw
{
	public abstract void draw();
}
class line extends Draw
{
	@Override
	public void draw() 
	{
		System.out.println("Drawing line");	
	}
}
class rectangle extends Draw
{
	@Override
	public void draw() 
	{
		System.out.println("Drawing a rectangle");	
	}	
}
class cube extends Draw
{
	@Override
	public void draw() {
		System.out.println("Drawing a cube");	
	}
}