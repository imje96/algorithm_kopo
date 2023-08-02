import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        char[] digits = n.toCharArray();
        
        // 숫자의 자리수를 내림차순으로 정렬하기 위해 배열을 정렬한 후 뒤집습니다.
        Arrays.sort(digits);
        for(int i = 0; i < digits.length / 2; i++) {
            char temp = digits[i];
            digits[i] = digits[digits.length - i - 1];
            digits[digits.length - i - 1] = temp;
        }

        // 결과를 출력합니다.
        System.out.println(new String(digits));
        scanner.close();
    }
}
