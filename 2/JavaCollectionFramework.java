import java.util.*;
public class JavaCollectionFramework{
    public static void main(String[] args){
    //Lists in Java & allow duplicates
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);

    System.out.println(list);
    
    //Sets -->donot allow duplicates
    HashSet<Integer> set = new HashSet<>();
    set.add(10);
    set.add(20);
    set.add(10);

    System.out.println(set);
    }
}