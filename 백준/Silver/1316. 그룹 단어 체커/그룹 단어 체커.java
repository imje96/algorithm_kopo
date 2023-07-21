import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for(int i = 0; i < N; i++) {
            String word = sc.next();
            if(checkGroupWord(word)) {
                count++;
            }
        }
        sc.close();
        
        System.out.println(count);
    }

    public static boolean checkGroupWord(String word) {
        boolean[] alpha = new boolean[26];
        int prev = 0;

        for(int i = 0; i < word.length(); i++) {
            int now = word.charAt(i);

            if(prev != now) {
                if(!alpha[now - 'a']) {
                    alpha[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
