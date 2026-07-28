public class BasicMaths {
    public static void main(String[] args){
        System.out.println("Hello");
        //Count number of digits
        int n=7789;
        int cnt = 0;
        while(n>0){
            cnt = cnt + 1;
            n = n / 10;
        }
        System.out.println(cnt);
        }
    }
