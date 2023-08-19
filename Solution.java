import java.util.*;

public class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();

        for (int num : nums) {
            numsSet.add(num);
        }
        int index = 0;
        for (int num : numsSet) {
            nums[index] = num;
        }


        return numsSet.size();
    }
}
