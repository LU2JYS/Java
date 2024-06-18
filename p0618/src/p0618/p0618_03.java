package p0618;

import java.util.Scanner;

public class p0618_03 {

	public static void main(String[] args) {
		//입력한 숫자를 출력하고 x,X를 입력하고 종료되도록 구현
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		//프로그램이 종료가 될때 입력한 숫자의 합을 출력을 해주세요
		
		
		while (true) {
			System.out.println("숫자를 입력하세요>>.(종료:x)");
			String input = scan.nextLine();	
			if (input.equalsIgnoreCase("x")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			int number = Integer.parseInt(input);
            sum += number;
            
            
        System.out.println("지금까지 입력한 숫자의 합: " + sum);
			
			
			
			
			
			System.out.println("입력한 숫자 : "+input);
		}
		
		
		
//		int i = 10;
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		}
		
//		int i = 10;
//		for(i=10;i>=0;i--) {
//			System.out.println(i);
//		}
		
		
		
//		int i = 0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
		// 초기화;조건식;증감식
//		for (int i=0;i<10;i++) {
//			System.out.println(i);
//		}
	}

}
