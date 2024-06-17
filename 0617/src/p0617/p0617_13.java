package p0617;

import java.util.Scanner;

public class p0617_13 {

	public static void main(String[] args) {
		//if,switch
		Scanner scan = new Scanner(System.in);
		System.out.println(">>첫번째 숫자를 입력하세요");
		int n = scan.nextInt();
		System.out.println(">>두번째 숫자를 입력하세요");
		int n2 = scan.nextInt();
		
		System.out.println("1.더하기(+) 2.빼기(-) 3.곱하기(*) 4. 나누기(/) ");
		System.out.println("원하는 번호를 입력하세요");
		int choice = scan.nextInt();
		 
		//switch문이 속도가 더 빠르다. 비교문이라 한번만 딱 비교해주고 결과출력
		switch(choice) {
		
		case 1:
			System.out.println("더하기 값은: "+(n+n2));
			break;
			
		case 2:
			System.out.println("빼기 값은: "+(n-n2));
			break;
			
		case 3:
			System.out.println("곱하기 값은: "+(n*n2));
			break;
			
		case 4:
			System.out.println("나누기 값은: "+(n/n2));
			break;
			
		default:
			System.out.println("번호를 잘못 입력하셨습니다.");
			break;
		}
		
		
		
		
		
	}

}
