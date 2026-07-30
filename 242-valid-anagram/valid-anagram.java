class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();

        if (s.length() != t.length()) return false;
        
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) - 1);
        }

        for (int freq : hm.values()) {
            if (freq != 0) return false;
        }

        return true;
    }
}