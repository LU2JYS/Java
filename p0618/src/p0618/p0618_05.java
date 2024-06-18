package p0618;

import java.util.Scanner;

public class p0618_05 {

    public static void main(String[] args) {
//    	int score[]= new int[5];
    	int[] score = new int[5]; //<--이 방법 사용
    	score[0]=1;
    	score[1]=2;
    	score[2]=3;
    	score[3]=4;
    	score[4]=5;
    	
    	for(int i=0; i<5; i++) {
    		System.out.println(score[i]);
    	}
    	
    	
    	
    	// 5개의 숫자를 입력받은 후 출력을 하세요
        Scanner scan = new Scanner(System.in);
       int[] numbers = new int[5]; //스코어의 5개의 공간을 만든다.

        for (int i = 0; i < 5; i++) {
            System.out.printf("숫자 %d를 입력하세요: ", i + 1);
            numbers[i] = scan.nextInt();
        }

      System.out.println("입력한 숫자:");
       for (int i = 0; i < 5; i++) {
           System.out.println(numbers[i]);
        }
    }
}

