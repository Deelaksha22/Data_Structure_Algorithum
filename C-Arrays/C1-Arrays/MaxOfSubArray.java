class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        for(int st = 0; st < nums.length; st ++){
            int subsum = 0;
            for(int end  = 0; end < nums.length; end++){
                subsum += nums[end];
                maxsum = Math.max(maxsum,subsum);
            }
        }
        return maxsum;
    }
}


//Kadane's algo
/*
int sum = 0;
int  maxsum = 0;
for(int i = 0; i < n; i ++){

    sum += nums[i];
    maxsum = Math.max( sum, maxsum);

    if( sum < 0){
        sum = 0;
    }
}
return maxsum; */