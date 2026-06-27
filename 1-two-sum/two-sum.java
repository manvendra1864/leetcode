class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int compliment = target - nums[i];
            if (h.containsKey(compliment)) {
                return new int[]{h.get(compliment), i};
            }
            h.put(nums[i], i);
        }
        return new int[]{};
    }
}