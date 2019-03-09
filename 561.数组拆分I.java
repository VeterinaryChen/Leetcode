class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 2){
            return nums[0];
        }
        for (int i=2 ; i<nums.length ; i+=2){
            nums[0] += nums[i];
        } 
        return nums[0];
    }
}
