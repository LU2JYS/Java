package p0618;

import java.util.Scanner;

public class p0618_07 {

	public static void main(String[] args) {
		// 45개의 로또번호 배열생성하고
		// 1-45까지의 6개의 숫자를 입력받아 출력하시요
		Scanner scan = new Scanner(System.in);
		
		// 45개의 배열 생성
		int[] ball = new int[45];
		
		//반복문을 사용해서 1-45까지의 숫자를 입력
		for (int i = 0; i < ball. length;i++) {
          ball[i] = i+1;
		}
		
		//로또번호 6개 입력--------------------------------
		int[] myArr = new int[6];
		for(int i = 0; i<myArr.length; i++) {
			System.out.printf("%d번째 숫자를 입력하세요.(1-45까지 숫자)>>",i+1);
			myArr[i] = scan.nextInt();
		}
		
		System.out.print("\n입력한 숫자 : ");
		for(int i = 0; i<myArr.length; i++) {
			System.out.print(myArr[i]+" ");
		}
		
		//랜덤으로 섞어보자-------------------------------
		int no = 0; //랜덤번호
		int t_value = 0; //값을 저장
		
		for (int i =0; i<300; i++) {
			no = (int)(Math.random()*45); //0~44
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
		}
		//-------------------------------------------
		
		//로또번호 출력-----------------------------------
		System.out.print("\n로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		
 //10개짜리 배열을 생성하고 숫자를 입력받아, 3,4번째 숫자만 출력하시요
		
//		Scanner scan = new Scanner(System.in);
//		int[] score = new int[10];
//		
//		for (int i = 0; i < 10; i++) {
//            System.out.printf("숫자 %d를 입력하세요: ", i + 1);
//            score[i] = scan.nextInt();
//		} 
//        System.out.println("3번째 숫자: " + score[2]);
//        System.out.println("4번째 숫자: " + score[3]);
	}
}
