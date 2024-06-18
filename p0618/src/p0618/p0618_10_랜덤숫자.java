package p0618;

import java.util.Scanner;

public class p0618_10_랜덤숫자 {

    public static void main(String[] args) {
        // 1-100까지의 랜덤숫자를 생성해서, 랜덤숫자를 맞추는 프로그램을 구현하시요
        // 숫자를 입력해서 큰수를 입력하세요, 작은수를 입력하세요
        // 기회는 10번까지만 입력가능하도록 구현.
        // 1. 1~100 랜덤숫자 변수 저장
        Scanner sc = new Scanner(System.in);
        // 메세지
        String answer = null;
        // 리플레이 변수
        char yn;
        boolean replay = false;

        while (!replay) {
            // 게임 시작시 코인 초기화
            int coin = 10;
            // 랜덤숫자 1 ~ 100 생성
            System.out.println("1 ~ 100사이의 랜덤숫자를 찾아보세요!");
            int rnum = ((int) (Math.random() * 100) + 1);
            // 정답 변수
            boolean right = false;
            // 최적 근사치 초기화
            int closestGuess = -1;
            int closestDifference = Integer.MAX_VALUE;

            // 정답이 아니거나 코인이 1개 이상일때 실행
            while (coin > 0 && !right) {
                // 유저 숫자 입력
                System.out.println("숫자를 입력해주세요.");
                // 입력숫자
                int num = sc.nextInt();
                // 입력숫자 유효성 변수
                boolean pass = false;

                // 입력 숫자 유효성 체크
                while (!pass) {
                    if (num <= 0 || num > 100) {
                        System.out.println("1 ~ 100사이의 숫자를 입력해주세요 !");
                        num = sc.nextInt();
                        pass = false;
                    } else {
                        pass = true;
                        // 통과시 기회 감소
                        coin--;
                    }
                    // 결과 메세지 선택
                    if (num > rnum)
                        answer = "입력하신 숫자가 너무 큽니다.";
                    else if (num < rnum)
                        answer = "입력하신 숫자가 너무 작습니다.";
                    else if (num == rnum)
                        answer = "정답입니다.";
                }

                System.out.println(answer);
                if (num == rnum) {
                    // 정답시 바로 탈출
                    right = true;
                } else {
                    System.out.println(coin + "회 남았습니다.");
                    right = false;
                    // 근사치 업데이트
                    int difference = Math.abs(num - rnum);
                    if (difference < closestDifference) {
                        closestDifference = difference;
                        closestGuess = num;
                    }
                }
            }

            if (!right) {
                System.out.printf("아쉽습니다. 정답은 %d였습니다.\n", rnum);
                if (closestGuess != -1) {
                    System.out.printf("가장 근사치의 숫자는 %d였습니다.\n", closestGuess);
                }
            }

            // 재도전 여부 체크
            System.out.println("다시 하시겠습니까 ? Y(y) / N(n)");
            yn = sc.next().charAt(0);
            if (yn == 'Y' || yn == 'y') {
                replay = false;
            } else {
                replay = true;
            }
        }
    }
}
