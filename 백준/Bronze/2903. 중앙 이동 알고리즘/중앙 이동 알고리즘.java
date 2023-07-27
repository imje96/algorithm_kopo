import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long result = (long)Math.pow((Math.pow(2, N) + 1), 2);
        System.out.println(result);
    }
}
