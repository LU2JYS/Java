package p0701;

public class p0701_04 {

	public static void main(String[] args) {
		for(int i=0;i<300;i++) {
			System.out.println(i+": "+"-");
		}
		for(int i=0;i<300;i++) {
			System.out.println(i+": "+"|");
		}
			
		//객체선언후, 참조변수명.메소드명
		p0701_04 c = new p0701_04();
		int n = c.max(20,10);
		System.out.println(n);
	}
	
	int max(int a,int b) { //인스턴스메소드
		return a>b?a:b;
	}
	
	int min(int x,(int a,int b)-> a>b?a:b;) {
		
	}
		
	
}

