class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int a = len;
        for(int i=0;i<len;i++){
            if(i!=nums[i]){
                a=i;
                break;
            }

        }
        return a;

        
    }
}