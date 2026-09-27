public class ConsicativeOnes {
    public static void main(String[] args){
        int []nums = {1,1,0,1,1,1,1,0,1,0,1,1};
        int cnt  = 0;
        int maxcnt  =  0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]  == 1){
                cnt++;
                maxcnt  = Math.max(cnt, maxcnt);
            }
            else
                cnt  =  0;
        }
        System.out.println(maxcnt);
    }
}
//Time complexity is O(N)