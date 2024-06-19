package p0619;

import java.util.Scanner;

public class p0619_01 {

    public static void main(String[] args) {
        // 로또번호 생성
        // 1-45 -> 6개 뽑아야함
        Scanner scan = new Scanner(System.in);
        
        // 45개 배열 생성
        int[] ball = new int[45];
        
        // 반복문을 사용해서 1-45까지의 숫자를 입력
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }
        
        // 랜덤으로 섞기
        int no = 0;
        int t_value = 0;
        for (int i = 0; i < 300; i++) {
            no = (int) (Math.random() * 45);
            t_value = ball[0];
            ball[0] = ball[no];
            ball[no] = t_value;
        }
        
        // my로또번호 입력
        int[] myArr = new int[6];
        int num = 0;
        int n = 0;
        
        while (n < 6) {
            System.out.printf("%d번째 숫자를 입력하세요>>>", n + 1);
            num = scan.nextInt();
            if (num < 1 || num > 45) {
                System.out.println("1~45까지의 숫자만 입력하셔야 합니다. 다시 입력해주세요");
                continue;
            }
            myArr[n] = num;
            n++;
        }
        
        System.out.print("\n입력한 숫자 : ");
        for (int i = 0; i < myArr.length; i++) {
            System.out.printf("%4d",myArr[i]);
        }
        System.out.println();
        
        // 로또번호 출력
        System.out.print("★★로또번호 : ");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%4d",ball[i]);
        }
        System.out.println();
        
        // 로도 당첨개수 출력 방법
        int count = 0;
        int[] myLotto = new int[6]; 
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (myArr[i] == ball[j]) {
                    myLotto[count] = myArr[i];
                    count++;
                    break;
                }
            }
        }
        
        System.out.println("로또 당첨개수는 :  " + count);
        
        // 당첨된 번호가 출력되도록 구현
        if (count > 0) {
            System.out.print("당첨된 번호 : ");
            for (int i = 0; i < count; i++) {
                System.out.print(myLotto[i] + " ");
            }
            System.out.println();
        } 	else {
            System.out.println("당첨된 번호가 없습니다.");
        	}

        switch (count) {
            case 6:
                System.out.println("축하합니다! 100억원 당첨입니다!");
                break;
            case 5:
                System.out.println("축하합니다! 1억원 당첨입니다!");
                break;
            case 4:
                System.out.println("축하합니다! 백만원 당첨입니다!");
                break;
            case 3:
                System.out.println("축하합니다! 만원 당첨입니다!");
                break;
            default:
                System.out.println("아쉽지만, 당첨되지 않았습니다.");
                break;
        }
    }
}