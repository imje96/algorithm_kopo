import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        String[] input = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i]);
            if (nums[i] == v) { 
                count++;
            }
        }

        System.out.println(count);
    }
}
