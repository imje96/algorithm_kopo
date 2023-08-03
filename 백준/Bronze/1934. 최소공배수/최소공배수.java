import java.util.Scanner;

public class Main {
    // 최대공약수를 구하는 함수 (유클리드 호제법)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // 최소공배수를 구하는 함수
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int t = 0; t < T; t++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int result = lcm(A, B);
            System.out.println(result);
        }
    }
}
