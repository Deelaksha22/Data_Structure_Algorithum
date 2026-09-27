public class RotateArray {
    public static void main(String[] args){
        int  [] nums  = {1,2,3,4,5,6,7};
        int  temp  = nums[0];
        for(int  i=1;i<nums.length;i++){
            nums[i-1]  = nums[i];
        }
        nums[nums.length-1]= temp;
        for(int x:nums){
            System.out.print(x+" ");
        }
    }
}
//time complexity  is O(n)