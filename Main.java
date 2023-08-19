public class Main { 
    public static void main(String[] args) { 
        Solution sol = new Solution();
        int[] nums = new int[] { 1, 1, 2 };
        int[] expectedNums = new int[] { 1, 2 };
        int k = sol.removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    } 
}
