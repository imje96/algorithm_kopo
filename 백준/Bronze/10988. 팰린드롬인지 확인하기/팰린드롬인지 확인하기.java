import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int start = 0;
        int end = word.length() - 1;
        while(start <= end) {
            if(word.charAt(start) != word.charAt(end)) {
                System.out.println(0);
                return;
            }
            start++;
            end--;
        }
        System.out.println(1);
    }
}
