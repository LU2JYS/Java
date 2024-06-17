package p0617;

import java.util.Scanner;

public class p0617_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
//		input("데이터를 입렵하세요");
		System.out.println("데이터를 입력하세요");
		String input = scan.next();
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		System.out.printf("입력한 데이터 : ",input,num);

		
	}

}
