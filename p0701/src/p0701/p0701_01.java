package p0701;

public class p0701_01 {

	public static void main(String[] args) {
		Card c = new Card();
		c.setPassword("1111");
//		c.number=15;
		c.setNumber(12);
		c.setNumber(10);
		System.out.println(c.getNumber());
		System.out.println(c.getPassword("admin"));
		System.out.println();
		
	}
}
