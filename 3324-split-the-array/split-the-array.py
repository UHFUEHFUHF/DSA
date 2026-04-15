class Solution:
    def isPossibleToSplit(self, nums: List[int]) -> bool:
        count = {}
        for i in range(len(nums)):
            if nums[i] not in count:
                count[nums[i]] = 1
            else:
                count[nums[i]] += 1
                if count[nums[i]] > 2:
                    return False
          
        
        return True
        