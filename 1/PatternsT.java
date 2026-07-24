public class PatternsT{
    public static void main(String[] args){
        int n = 4;
        printPattern2(n);
    }
    public static void printPattern1(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void printPattern2(int n){
        //Outer loop
        int num=1;
        for(int i=1;i<=n;i++){
            //Numbers
            for(int j=1;j<=i;j++){
            System.out.print(num+" ");
            num+=1;
            }
            System.out.println();
        }
    }
}
