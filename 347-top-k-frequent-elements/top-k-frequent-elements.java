class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            int maxKey = Collections.max(
                hm.entrySet(),
                Map.Entry.comparingByValue()
            ).getKey();

            result[i] = maxKey;
            hm.remove(maxKey);
        }

        return result;
    }
}