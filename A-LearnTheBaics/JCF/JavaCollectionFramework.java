import java.util.*;
public class JavaCollectionFramework{
    public static void main(String[] args){
    //Lists in Java & allow duplicates
    // ArrayList<Integer> list = new ArrayList<>();//list can store duplicate element
    // list.add(10);
    // list.add(20);
    // list.add(1,30);
    // list.add(10);
    //list.remove(20);
    //list.clear();

   //System.out.println(list);
    
    //Sets -->donot allow duplicates
    // HashSet<Integer> set = new HashSet<>();
    // set.add(10);
    // set.add(20);
    // set.add(10);

    // System.out.println(set);
    //STACK--->
    // Stack<Integer> s = new Stack<>();
    // s.push(10);
    // s.push(20);
    // s.push(22);
    // System.out.println(s);
    // System.out.println(s.peek());
    // s.pop();
    // System.out.println(s);

    //Queue---->First in First out
    Queue<Integer> q = new LinkedList<>();
    q.offer(10);
    q.offer(20);
    q.offer(66);
    q.offer(2);
    System.out.println(q);
    System.out.println(q.peek());
    q.poll();
    System.out.println(q);
    }
}