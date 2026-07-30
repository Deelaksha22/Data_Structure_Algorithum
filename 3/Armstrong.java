
import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Armstrong Numbers");
        int N = sc.nextInt();
        int length = String.valueOf(N).length();
        int original = N;
        int sum = 0;
        while (N > 0) {
            int last = N % 10;
            sum = sum + (int) (Math.pow(last, length));

            N = N / 10;
        }
        System.out.println(sum);
        if (original == sum) {
            System.out.println("true");
        } else {
            System.out.println("flase");
        }
    }
}
