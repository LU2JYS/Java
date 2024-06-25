package p0625;

public class Point3D extends Point{
	// int x ;
	// int y ;  자동으로 선언이 된다.
	int z;
	
	Point3D(int x, int y, int z){
		// 조상의 기본생성자를 만들지 않으면
		// super() 조상 생성자 에러발생
		// super(x,y); 매개변수조상생성자를 직접 입력해야함
		super(x,y); //항상 조상생성자를 넣어줘야 오류안남....
		this.x=x;
		this.y=y;
		this.z=z;
		
	}
}
