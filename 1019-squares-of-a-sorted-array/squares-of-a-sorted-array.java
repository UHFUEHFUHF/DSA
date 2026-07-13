import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sorted = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int ans = nums[i] * nums[i];
            sorted[i] = ans;
        }
        Arrays.sort(sorted);
        return sorted;

    }
}