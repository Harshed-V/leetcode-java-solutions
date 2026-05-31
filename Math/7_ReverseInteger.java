import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = reverse(a);
        System.out.println(b);
        System.out.print(Integer.MAX_VALUE);
        sc.close();
    }

    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int rem = x % 10;
            int newRes = res * 10 + rem;
            if (res != (newRes - rem) / 10) {  // checks overflow
                return 0;
            }
            res = newRes;
            x /= 10;
        }
        return res;
    }
}
