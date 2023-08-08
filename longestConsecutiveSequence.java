class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int c=1;
        int m=1;
        for(int i=0;i<nums.length-1;i++){
            //if(nums[i]==nums[i+1]) c++;
            if(nums[i]!=nums[i+1]){
            if(nums[i+1]-nums[i]==1) {
                c++;
                m=Math.max(c,m);
            }
            else{ c=1; }
            }
        }
        return m;
    }
}
