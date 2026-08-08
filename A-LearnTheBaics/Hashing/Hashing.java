import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 2};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int x : set) {

            int cnt = 0;

            for (int i = 0; i < arr.length; i++) {
                if (x == arr[i]) {
                    cnt++;
                }
            }

            System.out.println(x + " occurs " + cnt + " times");
        }
    }
}