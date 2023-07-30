import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[5];
        int sum = 0;

        // 5개의 수를 입력받고, 합계를 계산
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        // 평균 계산
        int average = sum / 5;

        // 수를 정렬
        Arrays.sort(numbers);

        // 중앙값 계산
        int median = numbers[2];

        // 평균과 중앙값 출력
        System.out.println(average);
        System.out.println(median);

        scanner.close();
    }
}
