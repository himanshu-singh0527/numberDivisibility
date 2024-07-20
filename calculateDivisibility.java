import java.util.Scanner;

public class calculateDivisibility {
    int calculate(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        calculateDivisibility q = new calculateDivisibility(); // Correct class name
        int result = q.calculate(m, n);
        System.out.println(result);
    }
}
