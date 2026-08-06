class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double curr_sum = 0;
        double max_avg = 0;

        for(int i = 0; i < k; i++){
            curr_sum += nums[i];
        }

        max_avg = curr_sum / k;

        for(int i = k; i < nums.length; i++ ){
            curr_sum += nums[i];
            curr_sum -= nums[i - k];

            double avg = curr_sum / k;
            max_avg = Math.max(max_avg , avg);
        }

        return max_avg;
    }
}