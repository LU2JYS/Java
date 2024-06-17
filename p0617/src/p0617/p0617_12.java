package p0617;

import java.util.Scanner;

public class p0617_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//숫자를 입력받아 ,60점 이상이면 합격,60점 미만이면
 // 90~92점 A-, 97~100점 A+, 80~82점 B-, 97~89점 B+
        System.out.print("점수를 입력하세요: ");
        String str = scan.nextLine();

        
        int score = Integer.parseInt(str);
        
        System.out.print(">>입력하신 등급는 ");
        
        if (score >= 97) 
        {System.out.println("A+입니다.");} 	
        else if (score >= 90) {
        if (score >= 93) {
        	System.out.println("A입니다.");} 
        else {System.out.println("A-입니다.");}
        } 
            
        
        else if (score >= 87) {
            System.out.println("B+입니다.");
        } else if (score >= 80) {
            if (score >= 83) {
                System.out.println("B입니다.");
            } else {
                System.out.println("B-입니다.");
            }
        } 
        
        else if (score >= 70) {
            System.out.println("C입니다.");
        } else if (score >= 60) {
            System.out.println("D입니다.");
        } else {
            System.out.println("F입니다.");
        }
	}
}
