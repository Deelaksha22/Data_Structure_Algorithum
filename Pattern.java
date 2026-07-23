import java.util.*;
public class Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        printPattern1(n);
        printPattern3(n);
    }
    static void printPattern1(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     static void printPattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
