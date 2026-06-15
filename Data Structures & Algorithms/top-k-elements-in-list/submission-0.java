class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> count = new HashMap<>();
    
    //putting key-value pairs inside hashmap
       for(int num : nums){
        count.put(num, count.getOrDefault(num, 0) + 1);
       }

        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }

//Inner class
        class FrequentComparator implements Comparator<int[]> {
            @Override
            public int compare(int[] a, int[] b){
                return b[0] - a[0];
            }
        }

        arr.sort(new FrequentComparator());
//Anonymous class
        arr.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b){
                return b[0] - a[0];
            }
        });

//Lambda Expression
        arr.sort((a, b) -> b[0] - a[0]);        

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = arr.get(i)[1]; //It behaves like a 2-d array but is not.
        }
        return res;

    }
}
