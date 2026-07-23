import java.util.*;
public class HardPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Patterns in normal order: ");
        printPattern(n);
        System.out.println("Pattern in reverse order: ");
        printReversePattern(n);
    }
    //function to print the pattern
    public static void printPattern(int n){
        for(int i=0;i<n;i++){
            // Print spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            // Print stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //patterns in reverse order
    public static void printReversePattern(int n){
        for(int i=0;i<n;i++){
            // Print spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            // Print stars
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
