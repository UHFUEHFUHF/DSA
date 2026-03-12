class Solution:
    def reverseVowels(self, s: str) -> str:
        s = list(s)
        vowels = "AEIOUaeiou"
        low = 0
        high = len(s) - 1
        while low < high:

            while low < high and s[low] not in vowels:
                low += 1
            
            while low < high and s[high] not  in vowels:
                high -= 1
            
            s[low] , s[high] = s[high] ,  s[low]

            low += 1
            high -= 1
        
        return "".join(s)