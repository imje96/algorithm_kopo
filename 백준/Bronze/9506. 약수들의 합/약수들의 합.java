import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            List<Integer> factors = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    factors.add(i);
                    sum += i;
                }
            }
            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < factors.size(); i++) {
                    if (i != 0) System.out.print(" + ");
                    System.out.print(factors.get(i));
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
        sc.close();
    }
}
