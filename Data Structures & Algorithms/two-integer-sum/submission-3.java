class Solution {
    public int[] twoSum(int[] nums, int target) {
        int idx = 0;
        int jdx = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int value = nums[i] + nums[j];
                if(value == target){
                  idx = i;
                   jdx = j;
                   break;
                }
            } 
        }
        int[] newArray = {idx, jdx};
        return newArray;
    }
}
