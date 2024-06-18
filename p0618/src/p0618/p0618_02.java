package p0618;

import java.util.Scanner;

public class p0618_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int birthY = 0, age= 0;
		String q="태어난 년도를 입력하세요";
		
		System.out.println(q);
		birthY=scan.nextInt();
		
		age = 2024-birthY+1;
		System.out.println("현재 나이는? "+age+"세 입니다");
				
	}

}
