package Exercise02;
import java.util.*;
import java.text.*;
public class DateCalculator {

	public static void main(String[] args) {
		int y = new Integer(args[0]).intValue();
		int m = new Integer(args[1]).intValue();
		int d = new Integer(args[2]).intValue();
		GregorianCalendar c = new GregorianCalendar();
		GregorianCalendar birthday = new GregorianCalendar(y, m-1, d);
		long days = c.getTimeInMillis() - birthday.getTimeInMillis();
		days = days/(24*60*60*1000);
		DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(date.format(birthday.getTime()) + "부터 " +date.format(c.getTime()) + "까지 살아온 날은 " + days + "일 입니다.");
	}

	
}
