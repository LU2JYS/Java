package p0626;

public class p0626_02 {

	public static void main(String[] args) {
		Buyer b = new Buyer("aaa","1111",2000,0);

		//구매 내역
//		Product[] p = new Product[10];
		
		
		//구매 목록
		Product t = new Tv();
		Product t2 = new Tv();
		b.buy(t); // tv1대를 구매함
		b.buy(t2); // tv1대를 구매함
		
		Product c  = new Computer();
		b.buy(c); //컴터1대를 구매함
		
		Product a  = new Audio();
		b.buy(a); ///오디오1대를 구매함
		
		Product r  = new Refrigerator();
		b.buy(r); //냉장고1개 구매
		b.buy(new Refrigerator());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Refrigerator());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		
		
		//cart 제품명, 가격을 모두 출력하세요
		b.summary();
		//b.cart : 배열
		//b.list
//		System.out.println("[구매내역]");
//		int sum = 0;
//		for(int i=0;i<b.list.size();i++) {
//			Product p = (Product)b.list.get(i);
//			System.out.println(p.pName);
//		//b.price
//			sum += p.price;
//		}
//		System.out.println("총 구매개수 : "+b.list.size());	
//		System.out.println("총 구매금액 : "+sum);		
	}
}
