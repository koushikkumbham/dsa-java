class Solution {
    public boolean canJump(int[] nums) {
    int i=0;
    int max=1;
    if(nums[i]==0){
    if(nums.length==1) return true;
    return false;
    }
    while(i<=max && i<nums.length){
        max=Math.max(max,i+nums[i]);
        i++;
    }
    if(max>=nums.length-1) return true;
    return false;    
    }
}