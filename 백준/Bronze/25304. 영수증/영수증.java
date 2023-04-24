import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();
        int totalPrice = 0;

        for (int i = 0; i < N; i++) {
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            totalPrice += price * quantity;
        }

        if (totalPrice == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}