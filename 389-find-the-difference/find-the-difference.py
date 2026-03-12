class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        s_hash = {}
        for char in s:
            if char in s_hash:
                s_hash[char] += 1
            else:
                s_hash[char] = 1
        
        for char in t:
            if char not in s_hash or s_hash[char] == 0:
                return char
            s_hash[char] -= 1
        
        