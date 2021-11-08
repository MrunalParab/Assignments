package collection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class CheckLeapYear 
{
public static void main(String[] args) 
{
		Date date = new Date("22/08/1998");
		Date date1 = new Date("12/10/1995");
		Date date2 = new Date("13/04/2017");
		Date date3 = new Date("15/09/2012");
		Date date4 = new Date("12/10/2016");
		Date date5= new Date("26/08/2004");
		Date date6 = new Date("10/12/2005");
		
		List<Date> dobList = new LinkedList<>();
		dobList.add(date);
		dobList.add(date1);
		dobList.add(date2);
		dobList.add(date3);
		dobList.add(date4);
		dobList.add(date5);
		dobList.add(date6);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		for(int i =0;i<dobList.size();i++) 
		{
			LocalDate ld =LocalDate.parse(dobList.get(i).date,df);
			String sd = (ld).format(df);
			
			if (ld.getYear()%4 ==0) 
			{
				System.out.println(sd + " "+"This is a leap year");
			}
			else
			{
				System.out.println(sd+" "+"This is not a leap year");
			}	
		}
}
}
class Date 
{
	String date;
	public Date(String date) 
	{
		super();
		this.date = date;
	}
	@Override
	public String toString() 
	{
		return " [date=" + date + "]";
	}
	public String getDate() 
	{
		return date;
	}
}
