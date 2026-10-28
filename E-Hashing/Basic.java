import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all elements to the HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Check each number
        for (int num : set) {

            // Start counting only if num is the beginning
            // of a consecutive sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // Step 3: Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                // Step 4: Update the longest sequence
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}

//time complexity--->O(n)
//space complexity--->O(n)