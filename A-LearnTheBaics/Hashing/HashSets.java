import java.util.*;
public class HashSets{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        //Insertion
        set.add(20);
        set.add(30);
        set.add(1999);
        // if(set.contains(20)){
        //     System.out.println("Yes!!");
        // }else{
        //     System.out.println("No!!");
        // }
        //set.remove(30);
        for(int val: set){
            System.out.println(val);
        }
        set.remove(30);
        // after removing of 30
        System.out.println(set);
    }
}