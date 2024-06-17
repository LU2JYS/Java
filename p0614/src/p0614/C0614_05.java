package p0614;

public class C0614_05 {

	public static void main(String[] args) {
		
		byte b = 127;
//		byte b2 = 128; //애러표시해 줌
		b=  (byte) (b+1);
		
		//오버플로우이다..
		System.out.println(b);
		
		int num = 2147483647;
		num = num+1;
		System.out.println(num);
		
		System.out.println();
		
		
		
		
		//문자열 타입 변경
//		char ch = 'A';
////		char ch2 = 'AA'; //2개이상 문자 안됨.
//		char ch3 = ' ';
//		 System.out.println(ch);
//		 
//		 String str = "AA";
//		 String str2 = "";
//		 String str3 = null;
//		 
//		 String s1 = "A"+"B";
//		 System.out.println(s1);
//		 System.out.println(""+7+7+7);
//		 System.out.println(7+7+7+"");
//		 System.out.println(7+7+7+""+7);
	}
}
