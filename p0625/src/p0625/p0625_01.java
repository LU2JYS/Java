package p0625;

public class p0625_01 {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		System.out.println("반지름 : "+c1.r);
		System.out.printf("원점 : (%d,%d) \n",c1.center.x,c1.center.y);
		
		
		Circle c2 = new Circle(new Point(150,150),50);
		System.out.println("반지름 : "+c2.r);
		System.out.printf("원점 : (%d,%d) \n",c2.center.x,c2.center.y);
		c2.draw();
		
		
		int[] a = {1,2,3};
		
		Point p1 = new Point(100,100);
		Point p2 = new Point(140,50);
		Point p3 = new Point(200,100);
		
		Point[] p = {p1,p2,p3}; //포인트 객체를 넣어야한다
		Triangle t1 = new Triangle(p);
		
		Point[] p4 = {new Point(100,100),new Point(140,50),new Point(200,100)};
		Triangle t2 = new Triangle(p4);
		
		Triangle t3 = new Triangle(new Point(0,0),new Point(100,100),new Point(50,50));
		
		
//		Point3D p= new Point3D(); //객체선언 먼저해라 꼭!!
//		p.x =100;
//		System.out.println(p.x);
//		
//		Point p2 = new Point(); //90%으로 포함관계이다..
		
		
		
	}
}
