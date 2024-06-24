package p0624;

public class p0624_01 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : "+d.x); //1번
		
		
		change(d.x);
		System.out.println("d.x 2 : "+d.x);//3번
	}
	static void change(int x) { //참조변수
		x=1000;
		System.out.println("change x : "+x);//2번
	}
}
