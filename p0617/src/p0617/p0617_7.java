package p0617;

import java.util.Scanner;

public class p0617_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 2개의 문자열을 입력받아
		// 문자열을 입력받아, 숫자이면 정수타입으로 변경해서 두수를 더하는 프로그램을 구현하시요
		System.out.print("첫번째 숫자를 입력하세요");
		String str1 =scan.nextLine();
		
		System.out.print("두번째 숫자를 입력하세요");
		String str2 =scan.nextLine();
		
		int num1 = Integer.parseInt(str1); //문자열을 정수형으로 변경
		int num2 = Integer.parseInt(str2);
		
		int sum = num1+num2;
				
		System.out.println("두수의 합은 :"+ sum);
		
		
	
	}
	

}
