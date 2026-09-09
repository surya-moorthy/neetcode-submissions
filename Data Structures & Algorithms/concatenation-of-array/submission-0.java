class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        
        int[] ans = new int[n * 2];
        int it = 0;

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < n; j++) {
                ans[j + it] = nums[j];
            }
            it += n;
        }
        return ans;
    }
}