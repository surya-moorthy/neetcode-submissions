class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> freq = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(freq.size() != 0 && (freq.contains(nums[i]))) {
                return true;
            }

            freq.add(nums[i]);
        }

        return false;
    }
}