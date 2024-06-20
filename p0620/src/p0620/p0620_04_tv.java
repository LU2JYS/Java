package p0620;

import java.util.Scanner;

public class p0620_04_tv {

	public static void main(String[] args) {
		//클래스 묶음
		Scanner scan = new Scanner(System.in);
		
		
		
		String color ="white";
		boolean power = false;
		int channel=0;
		
		String color2 ="blue";
		boolean power2 = false;
		int channel2=0;
		
		String color3 ="red";
		boolean power3 = false;
		int channel3=0;
		
		
		int a=0;
		//객체선언
		Tv tv1;
		tv1 = new Tv();
		System.out.println(tv1);
		
		Tv tv2 = new Tv();
		
		int[] num;       //배열을다루기위한 참조변수가 선언
		num = new int[5];// 배열생성후, 생성된 배열의 주소를 참조변수에 저장시켜줌
		System.out.println(num);
		
		
//		tv t2 = new tv();
//		tv t3 = new tv();
		
//		String color = "white";
//		boolean power = false;
//		int channel=0;
		//볼륨,사이즈....
		
		while(true) {
			System.out.println("1. tv 켜기");
			System.out.println("2. tv 끄기");
			System.out.println("---------------");
			System.out.println("tv를 상태를 선택하세요>>");
			int choice = scan.nextInt();		
			}
		
		
	}
}
