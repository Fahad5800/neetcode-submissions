class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] freq = new List[nums.length + 1]; // Bucket array
        Map<Integer, Integer> count = new HashMap<>();    // Count map

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // Fill the bucket array
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        // Place numbers in buckets based on their frequency
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            freq[frequency].add(number); //adding only number in the perspective bucket based on frequency
        }

        // Prepare the result from high frequency down
        int[] res = new int[k];
        int index = 0;

        for (int i = freq.length - 1; i >= 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}