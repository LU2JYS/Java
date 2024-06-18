package p0618;

import java.util.Scanner;

public class p0618_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][3];
		String[] title = {"이름","국어","영어","수학"};
		//2명의 학생의 성적을 입력받아 출력하시요.
		for(int i=0;i<3;i++) {
			System.out.println(title[0]+"을 입력하세요");
			name[i] =scan.next();
			for(int j=0;j<score[i].length;j++) {
				
				System.out.println(title[j]+"점수를 입력하세요");
				score[i][j]= scan.nextInt();		
			}
		}
		// 국어 영어 수학 타이틀 붙이기
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("--------------------");
		// 2명의 학생성적 출력
		for(int i=0;i<3;i++) {
			System.out.print(name[i]+"\t");
			
			for(int j=0;j<3;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
