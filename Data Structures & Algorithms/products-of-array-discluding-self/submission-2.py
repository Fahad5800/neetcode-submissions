class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [0] * n   # [0, 0, 0, ... 0] 

        for i in range(n):
            prod = 1
            for j in range(n):
                if i == j:
                    continue    #skip
                prod *= nums[j]
            res[i] = prod
        return res

