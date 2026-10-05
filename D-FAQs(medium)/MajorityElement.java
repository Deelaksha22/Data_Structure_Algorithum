import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 1, 1, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Find majority element
        for (int x : map.keySet()) {
            if (map.get(x) > nums.length / 2) {
                System.out.println(x);
                return;
            }
        }

        System.out.println(-1);
    }
}