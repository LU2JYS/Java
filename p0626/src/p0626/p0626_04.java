package p0626;

import java.util.ArrayList;

public class p0626_04 {

	public static void main(String[] args) {
		// C20240001,C240002....
		//1:white,4 2:red,5 3:blue,4 4:gray,3 5:black,5
		ArrayList list = new ArrayList();
		list.add(new Car("white",4));
		list.add(new Car("red",5));
		list.add(new Car("blue",4));
		list.add(new Car("gray",4));
		list.add(new Car("black",5));
		
		
		
		//전체 출력
				for(int i=0;i<list.size();i++) {
					Car c=(Car) list.get(i);
					System.out.printf("%s,%d \n",
							c.color,c.door);
			}
	}
}
