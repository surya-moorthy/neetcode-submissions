class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freq = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            int isch = freq.getOrDefault(t.charAt(i), 0);

            if(isch == 0) {
                return false;
            }   

            freq.put(t.charAt(i), isch - 1);
        }

        return true;
    }
}
