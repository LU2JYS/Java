package p0617;

public class p0617_9 {

	public static void main(String[] args) {
		// 문자열을 선언 방법 2가지 
		String str = "안녕";
		String str2 = "안녕2";
		String str3 = "안녕";
		int num = 5;
		int num2 = 5;
		
		// 기본타입 8개
		// 비교연산자를 통해서 확인가능
		// 숫자는 == 가능
		if(num==num2) {
			System.out.println("같은 숫자입니다.");
		}
		else {
		System.out.println("다른 숫자입니다.");
		}
	
		System.out.println("str : "+str);
		System.out.println("new str : "+str3);
		
		//★문자열,참조변수 비교는  equals메소드 사용해야함. == 사용하면 안됨.
		if(str.equals(str3)) {
			System.out.println("같은 문자입니다.");
		}
		else {
		System.out.println("다른 문자입니다.");
		}
		//-----------------------
		System.out.println("----------------");
		if(str == "안녕2") {
			System.out.println("같은 문자입니다.");
		} else {
			System.out.println("다른 문자입니다.");
		}

	}
}
