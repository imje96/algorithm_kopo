import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x == y && y == z) {
            System.out.println(10000 + x * 1000);
        } else if (x == y || y == z || z == x) {
            int same = 0;
            if (x == y) {
                same = x;
            } else if (y == z) {
                same = y;
            } else {
                same = z;
            }
            System.out.println(1000 + same * 100);
        } else {
            int max = 0;
            if (x > max) {
                max = x;
            }
            if (y > max) {
                max = y;
            }
            if (z > max) {
                max = z;
            }
            System.out.println(max * 100);
        }
    }
}
