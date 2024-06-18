package p0618;

public class p0618_04 {

    public static void main(String[] args) {
        // 구구단 4*4 = 16 까지만 출력 while,for 반복문에는 이름 부여가능
        for (int i = 2; i <= 9; i++) {
            System.out.printf("[ %d 단] \n", i);
            for (int j = 1; j <= 9; j++) {
                if (i > 4 || j > 4) {
                    break; // Stop the inner loop if either factor is greater than 4
                }
                System.out.printf("%d X %d = %d \n", i, j, i * j);
            }
            if (i > 4) {
                break; // Stop the outer loop if the factor exceeds 4
            }
        }
    }
}
