public class Gcd{
        public static void main(String[] args){
        int a = 11;
        int b = 13;
        while(a > 0 && b > 0){
            if(a > b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        if(a == 0)
            System.out.println(b);
        else
            System.out.println(a);
    }
}
// TC = O(log(fi)(min(a,b))) eucliden algorithum