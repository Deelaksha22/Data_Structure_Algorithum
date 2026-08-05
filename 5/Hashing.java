import java.util.*;
public class Hashing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 1, 2};
        for(int x: arr){
            System.out.println(x);
        }
        int[] hash = {0};
        for(int i = 0;i < arr.length;i++){
            hash[arr[i]]+=1;
        }
        System.out.println("Enter Num!!");
        int num = sc.nextInt();
        System.out.println(hash[num]);
    }
}