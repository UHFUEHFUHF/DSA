class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int first = -1;
        
        while(low <= high){
            int med = (low + high) / 2;

            if(nums[med] == target){
                first = med;
                high = med - 1;
            }
            else if(nums[med] > target){
                high = med - 1;
            }
            else{
                low = med + 1;
            }
        }
       if(first == -1){
        return new int[]{-1 , -1};
       }

        
        int last = -1;
        low = 0;
        high = nums.length - 1;
        while(low <= high){
            int med = (low + high) / 2;

            if(nums[med] == target){
                last = med;
                low = med + 1;
            }
            else if(nums[med] > target){
                high = med - 1;
            }
            else{
                low = med + 1;
            }
        }
       if(last == -1){
        return new int[]{-1 , -1};
       }

    return new int[]{first , last};
    }
}