public class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int prevValue = Integer.MIN_VALUE;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > prevValue) {
                nums[count] = nums[index];
                prevValue = nums[index];
                count++;
            }
        }
        
        return count;
    }
}
