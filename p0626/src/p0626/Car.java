package p0626;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Car {
	
	//serialNo자동생성
	static int count = 1;
	{//초기화블럭
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("");
		//s24001,s24002
		this.serialNo = "C"+String.format("%03d", count++);
	}
	Car(){}
	Car(String color,int door){
		this.color = color;
		this.door = door;	
	}
		String serialNo;
		String color;
		int door;
	}
	

