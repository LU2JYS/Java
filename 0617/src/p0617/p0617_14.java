package p0617;

import java.util.Scanner;

public class p0617_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int score = 0;
		
		while (true) {
            System.out.println("[성적처리프로그램]");
            System.out.println("1. 성적입력");
            System.out.println("2. 성적출력");
            System.out.println("3. 성적수정");
            System.out.println("4. 성적삭제");
            System.out.println("5. 학생검색");
            System.out.println("0. 종료");
            System.out.println("----------------------");
            System.out.println("원하는 번호를 입력하세요:");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    // 성적 입력
                    System.out.print("성적을 입력하세요: ");
                    score = scan.nextInt();
                    System.out.println("성적이 입력되었습니다.");
                    break;
                case 2:
                    // 성적 출력
                    System.out.print(">> 입력하신 등급은 ");
                    printGrade(score);
                    break;
                case 3:
                    // 성적 수정
                    System.out.print("수정할 성적을 입력하세요: ");
                    score = scan.nextInt();
                    System.out.println("성적이 수정되었습니다.");
                    break;
                case 4:
                    // 성적 삭제
                    score = 0;
                    System.out.println("성적이 삭제되었습니다.");
                    break;
                case 5:
                    // 학생 검색 (간단한 예제로 고정된 메시지 출력)
                    System.out.println("학생 검색 기능입니다.");
                    break;
                case 0:
                    // 종료
                    System.out.println("프로그램을 종료합니다.");
                    scan.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                    break;
            }
        }
    }

    // 학점을 출력하는 메서드
    public static void printGrade(int score) {
        if (score >= 97) {
            System.out.println("A+입니다.");
        } else if (score >= 90) {
            if (score >= 93) {
                System.out.println("A입니다.");
            } else {
                System.out.println("A-입니다.");
            }
        } else if (score >= 87) {
            System.out.println("B+입니다.");
        } else if (score >= 80) {
            if (score >= 83) {
                System.out.println("B입니다.");
            } else {
                System.out.println("B-입니다.");
            }
        } else if (score >= 70) {
            System.out.println("C입니다.");
        } else if (score >= 60) {
            System.out.println("D입니다.");
        } else {
            System.out.println("F입니다.");
        }
    }
}
