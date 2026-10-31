public class BinarySearchusingRecursion{
    public static void main(String[] args){
        int []nums = {10,20,30,35,40,50,55,60};

        int target = 55;
        int low = 0;
        int high = nums.length-1;
        int result = func(nums,low,high,target);
        System.out.println(result);
    }
    public static int func(int[]nums,int low,int high,int target){

        if(low > high){
            return -1;
        }
        int mid = (low + high)/2;

        if(nums[mid] == target){
            return mid;
        }
        else if(target > nums[mid]){
           return  func(nums, mid + 1, high, target );
        }
        return func(nums,low,mid-1,target);
    }

}