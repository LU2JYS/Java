package p0625;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class p0625_06 {

	public static void main(String[] args) {

//	Singleton s  =new Singleton();
		
		Singleton s = Singleton.getInstance(); //객체가 하나만 생성
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(d));
		 
		Calendar cal = Calendar.getInstance();	 //싱글톤패턴
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		System.out.printf("%d-%d-%d",year,month,date);
		}
}
