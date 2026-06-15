class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        my_map = {}
        for num in nums:
            my_map[num] = 1 + my_map.get(num, 0)

        arr = []
        for num, cnt in my_map.items():
            arr.append([cnt, num])
        arr.sort()

        res = []
        while len(res) < k:
            res.append(arr.pop()[1])
        return res