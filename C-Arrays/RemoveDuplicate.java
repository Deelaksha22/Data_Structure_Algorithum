//import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {


        int []nums  = {1,1,2,2,3,3,3,4,4,4,5,5,5,5,5};


        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     set.add(nums[i]);
        // }
        // int l = set.size();
        // System.out.print(l);

        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        for(int x:nums){
            System.out.print(x+ " ");
        }
        System.out.println();
        System.out.print(j);

    }
}