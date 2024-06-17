package p0617;

import java.util.Scanner;

public class p0617_10 {

	public static void main(String[] args) {
//숫자를 입력받아 ,60점 이상이면 합격,60점 미만이면 불합격을 출력하시요
		Scanner scan = new Scanner(System.in);

        // 사용자로부터 두 개의 문자열 입력 받기
        System.out.print("점수를 입력하세요: ");
        String str = scan.nextLine();

        
        int score = Integer.parseInt(str);
        
        System.out.print(">>입력하신 등급는 ");
        if (score >= 90) {
            System.out.println("A입니다.");
        } else if (score >= 80) {
            System.out.println("B입니다.");
        } else if (score >= 70) {
            System.out.println("C입니다.");
        } else if (score >= 60) {
            System.out.println("D입니다.");
        } else {
            System.out.println("F입니다.");
        }
        
//        System.out.print(">>입력한 점수는 ");
//        if (score >= 60) {
//            System.out.println("합격입니다.");
//        } else {
//            System.out.println("불합격입니다.");
//        }
        
	}
	

}
