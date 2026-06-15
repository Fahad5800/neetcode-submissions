class Solution {
    public int[] productExceptSelf(int[] nums) { 
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            int prod = 1;
            for(int j = 0; j < n; j++){
                if(i != j){
                    prod *= nums[j];
                }
            }
            res[i] = prod;
        }
        return res;
    }
}  
/*
*   take the array
    take its length
    run a for loop
    multiply all the contents of the array except the one which is iterating
*
*/