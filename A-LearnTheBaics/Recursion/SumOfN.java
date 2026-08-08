public class SumOfN {
    public static void main(String[] args) {
        int n = 4;
        func(n, 1);
    }
    public static void func(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }

        func(i - 1, sum * i);
    }
}