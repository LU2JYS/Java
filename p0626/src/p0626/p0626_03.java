package p0626;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

public class p0626_03 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("유관순",99,87,99));
		list.add(new Students("이순신",90,90,99));
		
		list.remove(1);
		
		System.out.println("입력된 개수 : "+list.size());
		
		//전체 출력
		for(int i=0;i<list.size();i++) {
			Students s=(Students) list.get(i);
			System.out.printf("%s,%s,%d,%d,%d,%d,%.2f,%d \n",
					s.stuNo,s.name,s.kor,s.eng,s.math,s.total,s.avg,s.rank);
		}
		
		
		
		
		
		int[] arr = new int[5];
		arr[0] =1;
		System.out.println("배열 개수 : "+arr.length);
//		int[] arr2 = {1,2,4,5}; //배열을 중간삭제가 안된다....1,2,0,4,5
//		
//		arr[2] = 0;
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));
		
	}

}
