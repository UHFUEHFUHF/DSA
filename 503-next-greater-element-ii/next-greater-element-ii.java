import java.util.*;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        int n = nums.length;
        for(int i = 0; i < 2 * n; i++){
            int curr_ind = i % n;
            int curr = nums[curr_ind];
            while(!stack.isEmpty() && curr > nums[stack.peek()]){
                int prev = stack.pop();
                ans[prev] = curr;
            }

            if (i < n){
            stack.push(curr_ind);
            }
        }

        return ans;
    }
}