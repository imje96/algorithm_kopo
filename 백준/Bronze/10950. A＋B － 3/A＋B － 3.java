import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수를 입력받음
        
        for (int i = 0; i < T; i++) { // T번 반복
            int A = sc.nextInt(); // A를 입력받음
            int B = sc.nextInt(); // B를 입력받음
            System.out.println(A + B); // A와 B의 합을 출력
        }
        
        sc.close();
    }
}
