package generic;
public class Genericswap 
{
public static void main(String args[])
{
	Integer arr[]= {10,20};
	System.out.println("Before Swapping:"+arr[0]+" "+arr[1]);
	swapnum(arr);
}
public static <S> void swapnum(S[] arr)
{
	S temp=arr[1];
	arr[1]=arr[0];
	arr[0]=temp;
	System.out.println("After Swapping:"+arr[0]+" "+arr[1]);
}
}
