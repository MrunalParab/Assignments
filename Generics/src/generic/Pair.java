package generic;
public class Pair <k,v>
{
private k key;
private v value;
public Pair(k key,v value)
{
super();
this.key=key;
this.value=value;
}
public<k,v> String show()
{
	return key+" "+value;
}
}
