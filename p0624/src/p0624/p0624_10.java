package p0624;

public class p0624_10 {

	public static void main(String[] args) {
		stu_score s = new stu_score();
		s.stuNo="S0001";
		s.name="홍길동";
		s.kor=100;
		s.kor=99;
		s.kor=87;
		s.total=s.kor+s.eng+s.math;
		s.avg=s.total/3.0;
		
		stu_score s2 = new stu_score("s0002","유관순",100,88,85);
		
		
		stu_score s3 = new stu_score();
		s3 = s2; //얕은복사
		s3.kor=10;
		
		System.out.println(s2.kor);
		
		
	}

}
