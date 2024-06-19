package p0619;

import java.util.Scanner;

public class p0619_04_좌표게임 {

    public static void main(String[] args) {
        // 1. 번호확인 배열 초기화
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            arr[0][i] = 1;
        }

        // 2. 번호섞기
        for (int i = 0; i < 300; i++) {
            int no = (int) (Math.random() * 5);
            int no2 = (int) (Math.random() * 5);
            int t_value = arr[0][0];
            arr[0][0] = arr[no][no2];
            arr[no][no2] = t_value;
        }

        // 3. 번호맞추기 화면 초기화
        String[][] lotto = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                lotto[i][j] = "★";
            }
        }

        Scanner scan = new Scanner(System.in);
        int winCount = 0;

        while (winCount < 5) {
            // 번호출력
            System.out.println("                     [ 좌표 ]");
            System.out.println("   |\t0\t1\t2\t3\t4\t");
            System.out.println("-------------------------------------------");
            for (int i = 0; i < 5; i++) {
                System.out.print(i + "  |\t");
                for (int j = 0; j < 5; j++) {
                    System.out.printf("%s\t", lotto[i][j]);
                }
                System.out.println();
            }

            // 좌표입력
            System.out.println("-------------------------------------------");
            System.out.println("가로 좌표를 입력하세요.");
            int x = scan.nextInt();
            System.out.println("세로 좌표를 입력하세요.");
            int y = scan.nextInt();

            // 유효한 좌표인지 확인
            if (x < 0 || x >= 5 || y < 0 || y >= 5) {
                System.out.println("유효하지 않은 좌표입니다. 다시 입력하세요.");
                continue;
            }

            // 이미 확인된 좌표인지 확인
            if (!lotto[x][y].equals("★")) {
                System.out.println("확인 된 좌표입니다. 다시 입력하세요.");
                continue;
            }

            // 5. arr배열에서 x,y의 좌표 값을 비교
            if (arr[x][y] == 1) {
                lotto[x][y] = "당첨";
                winCount++;
            } else {
                lotto[x][y] = "꽝";
            }
        }

        System.out.println("축하합니다! 모든 당첨을 찾았습니다.");
        scan.close();
    }
}
