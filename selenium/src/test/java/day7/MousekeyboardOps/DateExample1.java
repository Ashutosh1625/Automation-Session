package day7.MousekeyboardOps;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample1 {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println("Current Date in default format: "+d1);
		SimpleDateFormat sf=new SimpleDateFormat("MM/dd/yyyy");
		System.out.println("Formated date: "+sf.format(d1));
		
		System.out.println("**************************************");
		Calendar cal  = Calendar.getInstance();	    
	    //date in past or future based on days
		//cal.add(Calendar.DATE, -7);//+ive - future date | -ive  past date
		
		// date in past or future based on month
		//cal.add(Calendar.MONTH, 5);
		
		// date in past or future based on years
		cal.add(Calendar.YEAR, -5);
	    
	    SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
	    System.out.println(s.format(new Date(cal.getTimeInMillis())));

	}

}
/*
Pattern	Result
MM/dd/yyyy	01/02/2018
dd-M-yyyy hh:mm:ss	02-1-2018 06:07:59
dd MMMM yyyy	02 January 2018
dd MMMM yyyy zzzz	02 January 2018 India Standard Time
E, dd MMM yyyy HH:mm:ss z	Tue, 02 Jan 2018 18:07:59 IST

*/