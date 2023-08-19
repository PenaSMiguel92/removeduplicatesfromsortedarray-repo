import java.util.HashSet;

public class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        int index = 0;
        for (int num : numsSet) {
            System.out.println(num);
            nums[index] = num;
            index++;
        }


        return numsSet.size();
    }
}
