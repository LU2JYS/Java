package p0625;

public class p0625_08 {

	public static void main(String[] args) {
				Buyer b = new Buyer();	
				System.out.println("현재 있는 금액"+b.money);
				System.out.println("현재 있는 금액"+b.bonusPoint);
		
	Tv tv = new Tv();
	b.buy(tv);
	b.buy(tv);
	b.buy(tv);
	Computer c  = new Computer();
	b.buy(c);
	b.buy(c);
	b.buy(c);
	System.out.println("현재 있는 금액"+b.money);
	System.out.println("현재 있는 금액"+b.bonusPoint);
	}
	}

