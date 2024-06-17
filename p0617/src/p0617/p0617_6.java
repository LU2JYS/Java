package p0617;

import java.util.Scanner;

public class p0617_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("문자를 입력하세요>>");
		String str =scan.next();
		char ch = str.charAt(0);
//		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
//			System.out.println("영문자입니다");
//		}else {
//			System.out.println("영문자 아닙니다");
//		}
		
		//숫자인지 확인
		if((ch>='0' && ch<='9'))  {
			System.out.println("숫자입니다");
		}else {
			System.out.println("숫자가 아닙니다");
		}
		
		
		
		
		
		
		
		
	}

}
