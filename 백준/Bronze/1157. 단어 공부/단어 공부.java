import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();
        sc.close();

        int[] count = new int[26];  // 알파벳은 총 26개
        int max = -1;
        char result = '?';

        for(int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 65]++;  // 해당 알파벳의 count 증가 ('A'의 ASCII 코드값이 65이므로 65를 빼주었습니다)
        }

        for(int i = 0; i < 26; i++) {
            if(count[i] > max) {
                max = count[i];
                result = (char) (i + 65);  // 현재 가장 많이 나온 알파벳으로 result 갱신
            } else if(count[i] == max) {
                result = '?';  // 가장 많이 나온 알파벳이 둘 이상일 경우 ? 출력
            }
        }

        System.out.println(result);
    }
}
