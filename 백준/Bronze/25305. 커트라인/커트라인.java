import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 응시자의 수 N과 상을 받는 사람의 수 k를 입력 받는다.
        int N = sc.nextInt();
        int k = sc.nextInt();

        // 학생들의 점수를 저장할 배열을 선언하고 입력 받는다.
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }

        // 점수 배열을 내림차순으로 정렬한다.
        Arrays.sort(scores);
        // k번째로 큰 원소는 배열의 N-k 인덱스에 위치하므로 그 값을 출력한다.
        System.out.println(scores[N - k]);
    }
}
