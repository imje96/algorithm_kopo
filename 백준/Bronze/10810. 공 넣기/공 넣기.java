import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // N개의 바구니를 나타내는 배열을 생성하고 초기화합니다.
        int[] baskets = new int[N];

        for (int i = 0; i < M; i++) {
            int start = scanner.nextInt() - 1; // 배열 인덱스는 0부터 시작하므로 1을 뺍니다.
            int end = scanner.nextInt() - 1;
            int ball = scanner.nextInt();

            // 해당하는 범위 내의 바구니에 공을 넣습니다.
            for (int j = start; j <= end; j++) {
                baskets[j] = ball;
            }
        }

        // 각 바구니에 들어있는 공의 번호를 출력합니다.
        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}
