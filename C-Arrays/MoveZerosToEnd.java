import java.util.List;
import java.util.ArrayList;

public class MoveZerosToEnd {
    public static void main(String[] args){
        int[] nums = {1,0,2,0,3,0,0,4,5,6};
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp.add(nums[i]);
            }
        }
        for(int i=0;i<temp.size();i++){
            nums[i]=temp.get(i);
        }
        int nz = temp.size();
        for(int i=nz;i<nums.length;i++){
            nums[i]=0;
        }
        for(int x:nums){
            System.out.print(x+" ");
        }
    }
}
// public class MoveZerosToEnd {

//     public static void main(String[] args) {

//         int[] nums = {1, 0, 2, 0, 3, 0, 0, 4, 5, 6};

//         moveZeroes(nums);

//         for (int x : nums) {
//             System.out.print(x + " ");
//         }
//     }

//     public static void moveZeroes(int[] nums) {

//         int j = 0;

//         // Move all non-zero elements to the front
//         for (int i = 0; i < nums.length; i++) {

//             if (nums[i] != 0) {
//                 nums[j] = nums[i];
//                 j++;
//             }
//         }

//         // Fill remaining positions with zero
//         while (j < nums.length) {
//             nums[j] = 0;
//             j++;
//         }
//     }
// }