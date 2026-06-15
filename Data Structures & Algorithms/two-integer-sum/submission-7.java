class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> prevMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            prevMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(prevMap.containsKey(diff) && prevMap.get(diff) != i){
                return new int[]{i, prevMap.get(diff)};
            }
        }
        return new int[0];
    }
}
