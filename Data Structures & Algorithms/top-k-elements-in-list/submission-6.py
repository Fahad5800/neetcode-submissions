class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        my_map = {}
        for num in nums:
            my_map[num] = 1 + my_map.get(num, 0)

        arr = []
        for num, cnt in my_map.items():
            arr.append([cnt, num])  # [frequency, number] because python sorts list based on first element
        
        arr.sort()  # We sort list based on frequency

        res = []
        while len(res) < k:
            res.append(arr.pop()[1])   # arr.pop() remove and return last item i.e [3,3], but arr.pop()[1] return number
        return res