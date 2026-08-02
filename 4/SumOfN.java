public class SumOfN {
    public static void main(String[] args){
        int n = 3;
        int i = n;
        int sum = 0;
        fun(i,sum);
    }
    public static int fun(int i, int sum){
        if(i < 1){
            System.out.println(sum);
            return 0;
        }
        fun(i + 1, sum + i);
    }
}