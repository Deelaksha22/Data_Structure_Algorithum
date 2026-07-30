public class CheckPrime {
    public static void main(String[] args) {
        int n =21;
        int cnt = 0;
        for(int i = 1; i * i <=n; i++){
            if(n % i == 0){
                cnt++;
                if(i != n/i){
                    cnt++;
                }
            }
        }
        if(cnt == 2)
            System.out.println("true");
        else
            System.out.println("false");
    }
}