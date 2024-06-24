package p0624;

import java.util.Scanner;

public class Calculate {
	
	// 메소드 1개를 사용해서 처리하는 방법
	Scanner scan = new Scanner(System.in);

	
	void change(int[]score) {
		System.out.println("변경할 국어점수 : ");
		score[0]=scan.nextInt();	
		
		System.out.println("변경할 영어점수 : ");
		score[1]=scan.nextInt();	
		
		System.out.println("변경할 수학점수 : ");
		score[2]=scan.nextInt();	
		
	}
	
//	System.out.println("변경된 국어점수 : "+kor);
//	System.out.println("변경된 영어점수 : "+eng);
//	System.out.println("변경된 수학점수 : "+math);
	
	
	
	
	
	
	
	
	
	
	
	
//	void change(int kor,int eng,int math) {
//		System.out.println("변경할 국어점수 : ");
//		kor=scan.nextInt();	
//		
//		System.out.println("변경할 영어점수 : ");
//		eng=scan.nextInt();	
//		
//		System.out.println("변경할 수학점수 : ");
//		math=scan.nextInt();	
//		
//		System.out.println("변경된 국어점수 : "+kor);
//		System.out.println("변경된 영어점수 : "+eng);
//		System.out.println("변경된 수학점수 : "+math);
//	}
	
	
	
	
	int korchange(int kor) {
		
		return kor;
	}
	int engchange(int eng) {
		
		return eng;
	}
	int mathchange(int math) {
		
		return math;
	}
	
	
	
	
	
	
	
	
	
	
	
//	int result = 0;
//	
//	int cal(int[] arr,String str) {
//		
//		switch (str) {
//		case "+":
//			result = arr[0] + arr[1];
//			break;
//		case "-":
//			result = arr[0] - arr[1];
//			break;
//		case "*":
//			result = arr[0] * arr[1];
//			break;
//		case "/":
//			result = arr[0] / arr[1];
//			break;
//		}
//		return result;
//	}
}
