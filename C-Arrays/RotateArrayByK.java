public class RotateArrayByK {
    public static void  main(String[] args){
        int []  nums  =  {1,2,3,4,5,6,7};
        int d = 3;
        //BRUTEFORCE APPROACH
        int []temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = nums[i];
        }
        for(int i = d;i<nums.length;i++){
            nums[i-d]=nums[i];
        }
        int j = 0;
        for(int i = nums.length - d;i<nums.length;i++){
            nums[i] = temp[j];
            j++;
        }
        for(int x:nums){
        System.out.print(x+" ");
        }

    }
}