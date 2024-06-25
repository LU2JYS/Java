package p0625;

public class p0625_07 {

	public static void main(String[] args) {
		
		Car c = new Car();
		Car c2 = null;
		Ambulance a =new Ambulance();
		Ambulance a2 =null;
		FireEngine f = new FireEngine(); 
		FireEngine f2 = null;
		
		//형변환 - 자손타입에서 조상타입으로 : 형변환타입생략
//		c2 = (Car)a;
		c2=a; // 엠뷸 -> 카로 바꿈
		c2.drive();
//		c2.siren(); 사용불가능
		
		// 다형성 : 부모의 참조변수 자손의 객체를 다루는것
		// 자손의 참조변수로 조상의 객체를 다루는것(x)
		// 자손참조변수 = 조상의 객체
//		a2=(Ambulance)c;
		
		c=a; //부모의 참조변수에 자손객체를 넣어줌.
		if(c instanceof Ambulance) {
			System.out.println("가능합니다");
			c=a;
		}
		a2 =(Ambulance)c;
		
		
		a2.siren();
		a2=(Ambulance)c2; //car에서는 타입을 정해야한다..   꼭!!!!
	}
}
