package p0624;

import java.util.Date;
import java.text.SimpleDateFormat;

public class stu_score {
	
	{ //초기화 블럭
		count++;
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		//s20240001,s20240002
		this.stuNo ="S"+String.format("%04d",count);
	}
	
	// 기본 생성자 만들어준다...
	stu_score(){}
		
	
	stu_score(String name,int kor,int eng,int math) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		total=kor+eng+math;
		avg=total/3.0;
	}
	
	static int count; //클래스 변수 - 공용으로 사용
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
}
