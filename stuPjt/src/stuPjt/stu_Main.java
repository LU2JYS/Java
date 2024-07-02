package stuPjt;

import java.util.ArrayList;

public class stu_Main {

public static void main(String[] args) {
		
	ArrayList list = new ArrayList();
	list.add(new students("홍길동",100,100,99));
	list.add(new students("유관순",80,100,99));
	list.add(new students("이순신",89,99,99));
	list.add(new students("김구",100,99,99));
	list.add(new students("김유신",50,80,99));
	list.add(new students("홍길자",90,99,99));
	list.add(new students("홍길순",80,85,99));
	stuprocess sp = new stuprocess();
	
	while(true) {
		int choice = sp.screen(list);
		switch(choice) {
		case 1: //학생입력부분
			sp.stu_input(list);
			break;
			
		case 2: //학생 출력 부분
			sp.stu_print(list);
			break;
			
		case 3: // 학생성적수정
			sp.stu_update(list);
			break;
			
		case 4: //학생삭제
			sp.stu_delete(list);
			break;
			
		case 5: //학생검색
			sp.stu_search(list);
			break;
			
		case 6: //학생순위
			sp.stu_rank(list);
			break;
			}
		}
	}
}
