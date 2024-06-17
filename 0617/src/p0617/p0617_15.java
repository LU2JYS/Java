package p0617;

import java.util.Scanner;

public class p0617_15 {

	public static void main(String[] args) {
		// 1부터 10까지 랜덤숫자를 생성해서
		// 숫자 1개를 입력받아 정답인지 아닌지 출력하시요
		// 같으면 당첨, 다르면 꽝이라고 출력하시요
		
		int n = (int)(Math.random()*11);

        Scanner scan = new Scanner(System.in);

        // 사용자로부터 숫자 입력 받기
        System.out.print("1부터 10까지의 숫자 중 하나를 입력하세요: ");
        int userNum = scan.nextInt();
		
        if (userNum == n) {
            System.out.println("당첨입니다!");
        } else {
            System.out.println("꽝입니다! 정답은 " + n + "였습니다.");
        }
//		
        
//        //1부터 10까지의 정수 더하기
//        int sum = 0;
//        for(int i=1; i<=10; i++) {
//        	sum+=1; 
//        }
//		// 1부터 100까지의 랜덤 숫자를 생성하시요
//		int n = (int)(Math.random()*100)+1;
//		System.out.println(n);
//		
//		// 1부터 3까지의 랜덤 숫자를 생성하시요
//		int n2 = (int)(Math.random()*3)+1;
//		System.out.println(n2);
//		
//		// 1부터 45까지의 랜덤 숫자를 생성하시요
//		int n3 = (int)(Math.random()*45)+1;
//		System.out.println(n3);
		
		
		
//		Math.random(); //0<= x && x < 1
//		System.out.println(Math.random());
//		// 0-10까지의 랜덤숫자를 출력해보자
//		int n = (int)(Math.random()*11);
//		System.out.println(n);
//		
//		// 2-10까지의 랜덤숫자를 출력해보자
//		int n2 = (int)(Math.random()*9)+2;
//		System.out.println(n2);
//		
//		// 1-10까지의 랜덤숫자를 출력해보자
//		int num = (int)(Math.random()*10)+1;
//		System.out.println(num);
//		
//		// 1-100까지의 랜덤숫자를 출력해보자
//		int num2 = (int)(Math.random()*100)+1;
//		System.out.println(num2);
//		
//		// 1-4까지의 랜덤숫자를 출력해보자
//		int num3 = (int)(Math.random()*5)+1;
//		System.out.println(num3);
//		
//		// 1-19까지의 랜덤숫자를 출력해보자
//		int num4 = (int)(Math.random()*20)+1;
//		System.out.println(num4);
	}
}
