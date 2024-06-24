package p0624;

import java.util.Scanner;

public class p0624_05 {

	public static void main(String[] args) {
		//두개의 수와 1개의 사칙연산 +,-,*,/을
		//입력받아 결과값을 출력하시요
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("숫자를 입력하세요");
//		int x = scan.nextInt();
//		System.out.println("숫자를 입력하세요");
//		int x2 = scan.nextInt();
//		System.out.println("사칙연사을 입력하세요");
//		String str = scan.next();
		
		//인스턴스 메소드 = 객체선언후, 참조변수명,메소드명
		Calculate c = new Calculate();
//		int result = c.cal(x, x2, str);
		
		 // 배열로 숫자 입력받기
        int[] arr = new int[3];
        System.out.println("세 개의 숫자를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("사칙연사을 입력하세요");
		String str = scan.next();
        
        Calculate c = new Calculate();
        int result = c.cal(arr, str);
		
//		//10,5,+ = 15가 나오게끔
//		int result = 0;
//		switch (str) {
//	        case "+":
//	            result = x + x2;
//	            break;
//	        case "-":
//	            result = x - x2;
//	            break;
//	        case "*":
//	            result = x * x2;
//	            break;
//	        case "/":
//	            
//	            break;
//		
//				}
			System.out.println("결과값 : "+result);
		}
}
