import java.util.ArrayList;

public class PrintAllDivisors {
    public static void main(String[] args) {
        int n = 36;
        ArrayList<Integer> large = new ArrayList<>();//rep list

        // Print smaller divisors
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");

                if (i != n / i) {
                    large.add(n / i);
                }
            }
        }

        // Print larger divisors in reverse order
        for (int i = large.size() - 1; i >= 0; i--) {
            System.out.print(large.get(i) + " ");
        }
    }
}