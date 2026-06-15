class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
      for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
          if nums[i] + nums[j] == target:
            return [i, j]
          
# run a for loop
# with each iteration, add i term with the nested loops j term and check if i + j == target
# if sum == target, return i, j
# if not return go forward with the list

