import java.util.*;

public class PatternsTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr n");
        int n = sc.nextInt();
        printPatterns(n);

    }
    //Methodes
    public static void printPatterns(int n){
        System.out.println("Patterns:");
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
