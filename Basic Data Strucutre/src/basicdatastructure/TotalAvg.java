package basicdatastructure;
import java.util.*;
public class TotalAvg
{
public static void main(String[] args) 
{
	int s1e,s1m,s1s,s2e,s2m,s2s,s3e,s3m,s3s;
	
	System.out.println("Enter the marks scored by Student 1:");
	System.out.println("Marks obtained in English:");
	Scanner sc=new Scanner(System.in);
	s1e=sc.nextInt();
	System.out.println("Marks obtained in Maths:");
	s1m=sc.nextInt();
	System.out.println("Marks obtained in Science:");
	s1s=sc.nextInt();
	int s1total=s1e+s1m+s1s;
	int s1avg=s1total/3;
	System.out.println("Total marks obtained by Student 1:"+s1total);
	System.out.println("Average marks obtained by Student 1:"+s1avg);
	System.out.println("-----------------------------------");
	
	System.out.println("Enter the marks scored by Student 2:");
	System.out.println("Marks obtained in English:");
	s2e=sc.nextInt();
	System.out.println("Marks obtained in Maths:");
	s2m=sc.nextInt();
	System.out.println("Marks obtained in Science:");
	s2s=sc.nextInt();
	int s2total=s2e+s2m+s2s;
	int s2avg=s2total/3;
	System.out.println("Total marks obtained by Student 2:"+s2total);
	System.out.println("Average marks obtained by Student 2:"+s2avg);
	System.out.println("-----------------------------------");
	
	System.out.println("Enter the marks scored by Student 3:");
	System.out.println("Marks obtained in English:");
	s3e=sc.nextInt();
	System.out.println("Marks obtained in Maths:");
	s3m=sc.nextInt();
	System.out.println("Marks obtained in Science:");
	s3s=sc.nextInt();
	int s3total=s3e+s3m+s3s;
	int s3avg=s3total/3;
	System.out.println("Total marks obtained by Student 3:"+s3total);
	System.out.println("Average marks obtained by Student 3:"+s3avg);
	System.out.println("-----------------------------------");
	
	int e=s1e+s2e+s3e;
	int eavg=e/3;
	System.out.println("Total marks obtained by 3 students in English:"+e);
	System.out.println("Average marks obtained by 3 students in English:"+eavg);
	
	int m=s1m+s2m+s3m;
	int mavg=m/3;
	System.out.println("Total marks obtained by 3 students in Maths:"+m);
	System.out.println("Average marks obtained by 3 students in Maths:"+mavg);
	
	int s=s1s+s2s+s3s;
	int savg=s/3;
	System.out.println("Total marks obtained by 3 students in Science:"+s);
	System.out.println("Average marks obtained by 3 students in Science:"+savg);
}
}
