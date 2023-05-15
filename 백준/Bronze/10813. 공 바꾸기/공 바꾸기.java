import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        int[] balls = new int[N];
        for (int i = 0; i < N; i++) {
            balls[i] = i + 1;
        }
        
        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            swap(balls, x - 1, y - 1);
        }
        
        for (int ball : balls) {
            System.out.print(ball + " ");
        }
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
