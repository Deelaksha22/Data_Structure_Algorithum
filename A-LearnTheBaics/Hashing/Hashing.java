import java.util.*;
public class Hashing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 1, 2};
        for(int x: arr){
            System.out.println(x);
        }
        HashMap<Integer,Integer> hash = new HashMap<>();
        
        for(int i = 0;i < arr.length;i++){
            hash.put(arr[i],hash.getorDefault(arr[i],0)+1);
        }
        System.out.println("Enter Num!!");
        int num = sc.nextInt();
        System.out.println("Frequency of "+ num +" is "+hash.getorDefault(num,0));
    }
}