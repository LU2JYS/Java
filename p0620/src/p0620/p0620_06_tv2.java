package p0620;

public class p0620_06_tv2 {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println((a+1)+(b+1));
		System.out.println((a+1)-(b+1));
		System.out.println((a+1)*(b+1));
		System.out.println((a+1)/(b+1));
		
		
		
		
		
//		int num = 5;
//		int num2 = 10;
//		num2 = num;
//		System.out.println(num2);
		
		
		//Class는 객체 생성
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		t2=t1;
		//참조변수명.변수명 값을 넣을수있음.
		t1.channel=7;
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		
//		t.channelup();
//		System.out.println("현재채널 : "+t.channel);//8
//		t.channeldown(); //7
//		t.channeldown(); //6
//		System.out.println("현재채널 : "+t.channel);
		
		
		
		
	}
}
