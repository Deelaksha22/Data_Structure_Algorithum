import java.util.ArrayList;
import java.util.Collections;

public class LeaderInAnArray {

    public static void main(String[] args) {

        int[] nums = {1, 2, 5, 3, 1, 2};

        ArrayList<Integer> result = leaders(nums);

        System.out.println(result);
    }

    public static ArrayList<Integer> leaders(int[] nums) {

        int n = nums.length;
        int temp = nums[n - 1];

        ArrayList<Integer> list = new ArrayList<>();

        // Rightmost element is always a leader
        list.add(temp);

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] > temp) {
                list.add(nums[i]);
                temp = nums[i];
            }
        }

        // Convert right-to-left order
        // into original left-to-right order
        Collections.reverse(list);

        return list;
    }
}