class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        count = 0
        for num in nums:
            temp = 0
            while num != 0:
                digit = num % 10
                num = num // 10
                temp += 1
            if temp % 2 == 0:
                count += 1
        
        return count






        