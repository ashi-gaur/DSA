import java.util.*;

public class IntegerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            if (fun(u) == false) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }

    }

    public static Boolean fun(int n) {
        if (n == 1) {
            return false;
        }
        if (n % 3 == 0) {
            return true;
        }
        int u = n;
        int f = 0;
        for (int i = 0; i < 10; i++) {
            if (f == 0 && u + 1 % 3 == 0 || u - 1 % 3 == 0) {
                return true;
            }
            u++;
            if (f == 0) {
                f = 1;
            } else {
                f = 0;
            }
        }
        return false;
    }
}