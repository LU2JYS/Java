package p0617;

public class p0617_01 {

	public static void main(String[] args) {
		System.out.println(7+7+"");
		System.out.println(""+7+7);
		
		char ch = 'a';
		System.out.println(ch);
		
		int num2 = 98;
//		ch = num2; //에러난다...
		ch=(char)num2;
		System.out.println(ch);
		
		int num = 'a';
		System.out.println(num);
	}

}
