package stuPjt;

import java.text.SimpleDateFormat;
import java.util.Date;

public class students {

	static int count = 0;
	{//초기화블럭
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		//s24001,s24002
		this.stuNo = "S"+String.format("%03d", count++);
	}
	students(){}
	students(String name,int kor,int eng,int math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.total=total;
		this.avg=total/3.0;
	}
	
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	String getStuNo() {
		return stuNo;
	}
		void setStuNo(String StuNo) {
			this.stuNo = stuNo;
		}
	}


