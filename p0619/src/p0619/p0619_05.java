package p0619;

import java.util.Scanner;

public class p0619_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            arr[0][i] = 1;
        }
		//2. 번호 섞기 
        for(int i=0;i<300;i++) {
        	int no = (int)(Math.random()*5);
        	int no2 = (int)(Math.random()*5);
        	int t_value = arr[0][0];
        	arr[0][0] = arr[no][no2];
        	arr[no][no2] = t_value;
        }
	}
}
