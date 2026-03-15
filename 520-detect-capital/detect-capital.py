class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        upper_count = 0

        for c in word:
            if 65 <= ord(c) <= 90:
                upper_count += 1

        if upper_count == len(word): 
            return True
        if upper_count == 0:         
            return True
        if upper_count == 1 and 65 <= ord(word[0]) <= 90:  
            return True

        return False