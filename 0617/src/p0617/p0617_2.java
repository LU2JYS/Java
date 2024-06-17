package p0617;



public class p0617_2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		System.out.print(a/(double)b);
		System.out.println(10/3.0); //ln은 강제 엔터키로 줄단락해준다
		System.out.printf("%.2f \n",10/3.0);
		System.out.println("aaa");
		
		//여기 밑으론 거의 사용안한
		System.out.printf("%x \n",15); //16진수
		System.out.printf("%o \n",15); //8진수
		System.out.printf("%s \n",Integer.toBinaryString(15));//2진수로->문자열변경
		
	}

}
