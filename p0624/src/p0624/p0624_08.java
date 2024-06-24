package p0624;

public class p0624_08 {

	public static void main(String[] args) {
		
//		void println(boolean)
//		
//		void println(int a)
		stu_score stu;
		stu_score s = new stu_score("s0001","홍길동",100,60,80);
		s.kor=100;
		
		System.out.println("s.kor : "+s.kor);
		
		int a =10;
		
		// 5 팩토리얼 5*4*3*2*1
		int result = 1;
 		for(int i =5; i>0;i--) {
 			result*=i;
 		}
 		
 		//change()
 		p0624_08 c = new p0624_08();
 		c.change();
 		
 		
		System.out.println(result);
		add(); //객체선언 없이 클래스명.메소드명, 같은 클래스내에서는 클래스명 생략가능
		
	}
	void change() {//인스턴스 메소드 - 객체선언 후, 참조변수명.메소드명
		System.out.println(0);
	}
	
	void change(int a) {
		System.out.println(a);
	}
	
	void change(int a,int b) {
	System.out.println(a+b);
	}
	
	
	static void add() {
		
	}
}
