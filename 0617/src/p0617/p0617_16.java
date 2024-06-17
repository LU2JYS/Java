package p0617;

import java.util.Scanner;

public class p0617_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 홀수 구구단만 출력하시요
		
		System.out.println("홀수 구구단을 출력합니다:");
        
        // 홀수 구구단 출력
        for (int dan = 1; dan <= 9; dan += 2) { // 1, 3, 5, 7, 9 단만 반복
            System.out.println(dan + "단:");
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
            } 
		
		
		
		//		// 1-10까지의 합을 출력하세요
//		int sum = 0;
//		int i =0;
//		for(i = 1;i<=10;i++) {
//			sum += i;
//		}
//		System.out.println((i-1)+ "까지의 합 : "+sum);
		
		
		
		
//		// 1-100까지의 합을 구하는데, sum값이 150을 넘었을때 i값을 출력하시요.
//		// break;
//		
//		int sum = 0;
//
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//
//            if (sum > 150) {
//                System.out.println("합계가 150을 넘었을 때의 i 값: " + i);
//                System.out.println("합계가 150을 넘었을 때의 총합 값: " + sum);
//                break;  // 조건을 만족하면 반복문을 종료
//            }
//		
		
		
		
		//		// <★> 증요!!!
//		// 구구단 중첩 for문 사용
////		Scanner scan = new Scanner(System.in);
//		System.out.println("1~9단까지의 구구단을 출력합니다:");
//        
//        // 구구단 출력
//        for (int dan = 1; dan <= 9; dan++) {
//            System.out.println(dan + "단:");
//            for (int i = 1; i <= 9; i++) {
//                System.out.println(dan + " x " + i + " = " + (dan * i));
//            }
//		
		
		// 10번 입력받을때마다  숫자 값을 합계하시요 
//		Scanner scan = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//
//        System.out.println("10번 입력받을 때마다 숫자 값을 합산합니다.");
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.print("숫자를 입력하세요: ");
//            int number = scan.nextInt();
//            sum += number;
//            count++;
//
//            if (count == 10) {
//                System.out.println("현재까지의 합계는 " + sum + "입니다.");
//                count = 0;
//                sum = 0; // 다음 10번을 위해 초기화
//            }
		
		// 1-100까지 홀수만 더해서 최종값을 출력하시요
		// 1-100까지 숫자를 더해서 출력하시요
//		int sum = 0;
//
//        // 1부터 100까지의 홀수만 더하기
//        for (int i = 1; i <= 100; i += 2) {
//            sum += i;
//        }
//		// 최종 값 출력
//        System.out.println("1부터 100까지의 홀수의 합은 :"+ sum);
		
		
		
		
		//1부터 10까지의 정수 더하기
//      int sum = 0;
//      for(int i=1; i<=10; i++) {
//      	sum = sum + i; 
//      	System.out.println("i : "+sum);
//      }
//      System.out.println("최종 sum :"+sum);
	}
}
}