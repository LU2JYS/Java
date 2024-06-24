package p0624;

import java.util.Scanner;

public class p0624_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[3];
		score[0] = 100;
		score[1] = 99;
		score[2] = 90;
		
		int kor = 100;
		int eng = 99;
		int math = 90;
		System.out.println("현재 국어점수 : "+kor);
		System.out.println("현재 영어점수 : "+eng);
		System.out.println("현재 수학점수 : "+math);
		
		//메소드를 사용
		Calculate c = new Calculate();
		c.change(score);
		
		System.out.println("-------------------");
		System.out.println("변경된 국어점수 : "+score[0]);
		System.out.println("변경된 영어점수 : "+score[1]);
		System.out.println("변경된 영어점수 : "+score[2]);
//		c.change(kor, eng, math);
		
		
//		kor= c.korchange(kor);
//		eng=c.engchange(eng);
//		math=c.mathchange(math);
//		
		}
}
