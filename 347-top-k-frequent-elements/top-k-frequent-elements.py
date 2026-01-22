class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        for num in nums:
            if num in count:
                count[num] += 1
            else:
                count[num] = 1
        sorted_dict = sorted(count.items() , key=lambda x : x[1] , reverse=True)
        
        answer = []
        for i in range(k):
            answer.append(sorted_dict[i][0])
        
        return answer
                
        