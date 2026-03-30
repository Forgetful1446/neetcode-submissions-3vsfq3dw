class Solution(object):
    def maxArea(self, height):
        n = len(height)
        result = 0
        flag = 0
        if n < 2 : return -1
        if n == 2: return min(height[1],height[0]) 

        left = 0
        right = n - 1

        while left < right:
            
            if flag == 0:
                for i in range(left, right + 1):
                    result = max(min(height[i], height[right]) * (right - i),result)
                right -=1
                flag = 1
            elif flag == 1:
                for i in range(right, left - 1, -1):
                    result = max(min(height[left], height[i]) * (i - left),result)
                left += 1
                flag = 0
        return result