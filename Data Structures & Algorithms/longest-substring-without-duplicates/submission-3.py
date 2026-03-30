class Solution(object):
    def lengthOfLongestSubstring(self, s):
        maxLength = 0
        if len(s) <= 0: return maxLength

        check = set()
        right = 0
        left = 0
        while right < len(s):
            if s[right] not in  check:
                check.add(s[right])
            elif s[right] in check:
                maxLength = max(maxLength, len(check))
                right = left
                left += 1
                check.clear()
            right += 1

        
        return max(maxLength, len(check))