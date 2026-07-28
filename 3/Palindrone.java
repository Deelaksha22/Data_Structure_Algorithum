public  class Palindrone {
    public static void main(String[] args){
        int n =1331;
        int dup = n;
        int revNum = 0;
        while(n!=0){
            int  last = n % 10;
            revNum  = (revNum * 10) + last;
            n =  n / 10;
        }
        if( revNum == dup){
                System.out.println("true");
            }
            else
                System.out.println("flase");

    }
    
}
