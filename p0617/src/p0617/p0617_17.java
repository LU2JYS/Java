package p0617;

import java.util.Random;

public class p0617_17 {

    public static void main(String[] args) {
    	//1-100까지, 랜덤숫자 10개를 생성해서, 10개의 숫자의 합을 출력하시요
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int randomNumber = 1 + random.nextInt(100); // nextInt(100) gives 0-99, so add 1 to make it 1-100
            System.out.println("랜덤숫자 :" + (i + 1) + ": " + randomNumber);
            sum += randomNumber;
        }

        System.out.println("랜덤 10개 숫자의 합: " + sum);
    }
}
