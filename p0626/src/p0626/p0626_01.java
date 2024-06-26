package p0626;

import java.util.Scanner;

public class p0626_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Buyer b = new Buyer("aaa","1111",10000000,0);
		while(true) {
			System.out.println("Id를 입력하세요");
			String id=scan.next();
			System.out.println("Pw를 입력하세요");
			String pw=scan.next();
			
			if(b.userId.equals(id) && b.userPw.equals(pw)) {
				System.out.println("아이디,패스워드가 일치합니다");
				break;
			}else {
				System.out.println("아이디,패스워드가 일치하지 않습니다.");
			}
		}
		System.out.println("구매 사이트에 접속을 진행합니다");
	}
}
