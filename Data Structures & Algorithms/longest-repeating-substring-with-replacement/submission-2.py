class Solution(object):
    def characterReplacement(self, s, k):
        
        maxCount = 0
        left = 0
        freq = {}

        for right in range(len(s)):
            freq[s[right]] = freq.get(s[right], 0) + 1
            maxCount = max(maxCount,freq[s[right]])

            if right - left  + 1 - maxCount > k:
                freq[s[left]] -= 1
                left += 1
        
        return len(s) - left