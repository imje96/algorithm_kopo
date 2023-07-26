import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();

            // 입력받은 두 수가 모두 0이면 종료
            if (firstNum == 0 && secondNum == 0) {
                break;
            }

            if (secondNum % firstNum == 0) {
                System.out.println("factor");
            } else if (firstNum % secondNum == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }

        scanner.close();
    }
}
