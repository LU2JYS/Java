package p0620;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class p0620_03 {

	public static void main(String[] args) {
		 Date date = new Date();
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss a");
		 System.out.println(sdf.format(date));
		 
		 
		 //Calender 객체
		 Calendar cal = Calendar.getInstance();		 
		 SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss a");
		 System.out.println(cal.get(Calendar.YEAR));
		 
		 
		 
		 
		 // currentTimeMillis활용 날짜출력 
		 System.out.println(date.getTime());
		 long today = System.currentTimeMillis();
		 System.out.println(today);
		 SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss a");
		 System.out.println(sdf2.format(today));
	}
}
