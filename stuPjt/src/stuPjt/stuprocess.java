package stuPjt;

import java.util.Scanner;
import java.util.ArrayList;


public class stuprocess  {

		Scanner scan = new Scanner(System.in);
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		String stuNo,name;
		int kor,eng,math,total,rank;
		double avg;
		int choice;
		
		//화면부분 메소드
		int screen(ArrayList list) {
			System.out.println("[학생성적 프로그램]");
			System.out.printf("현재 입력된 학생수 : %d 명 \n",list.size());
			System.out.println("---------------------");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적입력");
			System.out.println("5. 학생검색");
			System.out.println("6. 등수처리");
			System.out.println("7. 학생성적정렬");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();
			scan.nextLine();
			
			return choice;
		} //screen
		
		//학생입력부분 메소드
		void stu_input(ArrayList list) {
			while(true) {
				System.out.printf("%d번째 학생이름을 입력하세요 >>(0.이전페이지 이동) \n");
				name = scan.nextLine();
				
				if(name.equals("0")){
					System.out.println("이전 페이지로 이동합니다.!!");
					System.out.println();
					break;
				}
				System.out.printf("%s 점수를 입력하세요>> \n",title[2]); //국어점수 입력
				kor = scan.nextInt();
				System.out.printf("%s 점수를 입력하세요>> \n",title[3]); //영어점수 입력
				eng = scan.nextInt();
				System.out.printf("%s 점수를 입력하세요>> \n",title[4]); //수학점수 입력
				math = scan.nextInt();
				scan.nextLine(); //문자 또는 엔터를 치기 전까지의 문장 전체를 입력받는다.(점수 3개 입력)
				
				
				//list저장
				list.add(new students(name,kor,eng,math));
				
				//입력완료
				System.out.printf("%s 학생 점수를 저장합니다. \n",name);
				System.out.println();
			}
		}// stu_input
		
		//학생출력부분 메소드
		void stu_print(ArrayList list) {
			System.out.println("             [학생 성적출력] ");
			for(int i=0; i<title.length;i++) {
				System.out.printf("%s\t",title[i]);
			}
			System.out.println();
			System.out.println("-----------------------------------");
			if(list.size() == 0 ) {
				System.out.println("출력할 학생 성적이 없습니다");
				System.out.println();
				return;
			}
			for(int i=0; i<list.size();i++) {
				students s = (students) list.get(i);
				System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n",
				s.stuNo,s.name,s.kor,s.eng,s.math,s.total,s.avg,s.rank);
			} // %s는 문자 포맷, %d는 정수 포맷, %f는 실수 포맷
			System.out.println();
		} //stu_print
		
		//학생성적 수정 메소드
		void stu_update(ArrayList list) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}//class
