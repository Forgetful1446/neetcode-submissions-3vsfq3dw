class Solution:
    def largestRectangleArea(self, heights):
        if len(heights) <= 0: return -1
        result = 0

        for i in range(len(heights)):
            left, right = i - 1, i + 1
            width = 1

            while left >= 0 and heights[left] >= heights[i]:
                left -= 1
                width += 1
            
            while right < len(heights) and heights[right] >= heights[i]:
                right += 1
                width += 1

            result = max(result, width * heights[i])

        return result