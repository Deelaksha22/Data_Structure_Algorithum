public class ReverseNum {
    public static void main(String[] args){
        int n=7789;
        int revNum = 0;
        while(n>0){
            int lastDig = n % 10;
            revNum = (revNum * 10) + lastDig;
            n = n/10;
        }
        System.out.println(revNum);
        }
    }
