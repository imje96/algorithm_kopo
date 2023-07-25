import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = scanner.nextLine();
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 15; i++) {  // max length of words
            for (int j = 0; j < 5; j++) {  // number of lines
                if (i < words[j].length()) {
                    result.append(words[j].charAt(i));
                }
            }
        }

        System.out.println(result);
    }
}
