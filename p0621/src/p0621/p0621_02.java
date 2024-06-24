package p0621;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Stu_process {
	
    static Scanner scan = new Scanner(System.in); //클래스변수
	
	// 1. 화면부분
    int screen() {
		//화면부분
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("---------------------");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 학생검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("---------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		scan.nextLine();
		return choice;
	}//screen
	
	// 1. 학생성적입력부분 - Stu_score[] sc,int s_count
	int stu_input(Stu_score[] sc,int s_count) {
		while(true) {
			System.out.println("[ 학생 성적입력 ]");
			
			//학번자동생성
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yy");
			String stuNo1 = "S"+ sdf.format(date) + String.format("%03d", s_count+1);
			// 객체선언
			sc[s_count] = new Stu_score();
			// 학번저장
			sc[s_count].stuNo = stuNo1;
			System.out.println("학생번호 : "+stuNo1);
			// 이름저장
			System.out.println("이름을 입력하세요.>>(0.이전페이지 이동) ");
			sc[s_count].name = scan.nextLine();
			
			//이전페이지 이동
			if(sc[s_count].name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.!!");
				System.out.println();
				break;
			}
			
			// 국어,영어,수학점수 저장
			System.out.println("국어점수를 입력하세요.>> ");
			sc[s_count].kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>> ");
			sc[s_count].eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>> ");
			sc[s_count].math = scan.nextInt();
			scan.nextLine();
			//합계,평균 저장
			sc[s_count].total = sc[s_count].kor+sc[s_count].eng+sc[s_count].math;
			sc[s_count].avg = sc[s_count].total/3.0;
			
			//입력완료
			System.out.println("< 학생성적 입력완료 >");
			System.out.printf("%s 학생성적이 저장되었습니다.",sc[s_count].name);
			System.out.println();
			s_count++;
		}//while
		
		return s_count;
		
	}//stu_input
	
	// 2. 학생성적입력부분 - Stu_score[] sc
	void stu_output(Stu_score[] sc,int s_count,String[] title) {
		System.out.println("                    [ 학생 성적출력 ]");
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		for(int i=0;i<s_count;i++) {
			System.out.printf("%s\t",sc[i].stuNo); //학번
			System.out.printf("%s\t",sc[i].name);  //이름
			System.out.printf("%d\t",sc[i].kor);   //국어
			System.out.printf("%d\t",sc[i].eng);   //영어
			System.out.printf("%d\t",sc[i].math);  //수학
			System.out.printf("%d\t",sc[i].total); //합계
			System.out.printf("%.2f\t",sc[i].avg); //평균
			System.out.printf("%d\t", sc[i].rank); //등수
			System.out.println();
		}
		System.out.println();
	}//stu_output
	
	
	
}//class