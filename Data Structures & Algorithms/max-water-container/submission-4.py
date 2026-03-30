class Solution(object):
    def maxArea(self, height):
        n = len(height)
        result = 0
        if n < 2 : return -1
        if n == 2: return min(height[1],height[0]) 

        left = 0
        right = n - 1

        while left < right:
            result = max(result,min(height[left], height[right]) * (right - left))
            
            if height[left] > height[right]:
                right -=1
            elif  height[left] < height[right]:
                left +=1
            elif height[left] == height[right]:
                left += 1
                right -= 1
            
        return result