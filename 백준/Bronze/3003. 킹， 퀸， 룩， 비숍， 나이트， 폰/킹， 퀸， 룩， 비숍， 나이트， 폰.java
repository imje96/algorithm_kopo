import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] correctCount = {1, 1, 2, 2, 2, 8};
        int[] foundPieces = new int[6];

        for (int i = 0; i < 6; i++) {
            foundPieces[i] = scanner.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(correctCount[i] - foundPieces[i] + " ");
        }
    }
}
