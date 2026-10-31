import java.util.*;

public class HashMap {
    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 4, 1, 1, 2};

        Map<Integer, Integer> map = new java.util.HashMap<>();

        // Count the frequency of each element
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Print each element and its frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}