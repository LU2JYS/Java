package p0614;

public class C0614_7 {

	public static void main(String[] args) {
		
		
		
		// printf의 출력
		// 소수점 제한 출력가능, 8진수,16진수 출력가능
		System.out.println(10.0/3);
		System.out.printf("%.2f \n",10.0/3); //줄단락을 입력해야함
		int x = 0x1a; //16진수 표현 1a 값은? 1x16+0x16
		System.out.println("x : "+x);
		System.out.printf("%x \n",x); //printf 16진수 출력가능
		
		long a = 10L;
		System.out.printf("%d \n",a);
		int b = 20;
		System.out.printf("%d \n",b);
		
		int age = 10;
		int year = 2014;
		System.out.printf("나이 :%d, 년도 :%d \n",age,year);
		System.out.println("나이 :"+age+"세, 년도 :"+year+"년");
		
		System.out.printf("[%5d] \n",10);  //빈공백으로 채워짐
		System.out.printf("[%05d] \n",10); //빈공백이 0으로 채워짐
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
