import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int size = N / 4;
        String type = "long int";
        if (size == 1) {
            System.out.println(type);
            return;
        }
        for (int i = 0; i < size - 1; i++) {  // for문 조건 수정
            type = "long " + type;
        }
        System.out.println(type);
    }
}
