package p0614;

public class C0614_01 {

	public static void main(String[] args) {
		
		
		//논리형
		boolean bol = true;
		boolean bol2 = false;
		
		//문자형
		char ch1 = 'a';
//		char ch2 = 'xx'; // 에러, char는 문자 1개만 저장
		char ch3 = ' '; //빈공간은 안되지만 한칸 빈공백은 저장 가능
//		char ch4 = ''; // 에러
		
		
		
		//정수형 - byte,short,(int),long 타입
//		byte a = 127; //byte 127까지 입력가능
		short b = 2;
//		int c = 2147483647; //2147483647까지 입력가능
		long d = 2147483648L;
		
		//실수형 - float : F를 무조건 붙여야 함,double 타입
		float e =3.14F; //: 접미사 F를 무조건 붙여야 실행됨
		double f =3.14; //D붙여도되고 안해도됨..
		
		System.out.println(a,b,c);
//		int num = 10;
//		System.out.println(num);
		//print(num);
	}//main
}//class
