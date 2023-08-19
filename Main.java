public class Main { 
    public static void main(String[] args) { 
        Solution sol = new Solution();
        int[] nums = new int[] { -3, -1, 0, 0, 0, 3, 3};
        int[] expectedNums = new int[] { -3, -1, 0, 3};
        int k = sol.removeDuplicates(nums);

        System.out.println(k == expectedNums.length);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
            System.out.println(nums[i] == expectedNums[i]);
        }
    } 
}
