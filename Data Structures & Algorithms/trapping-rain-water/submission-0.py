class Solution(object):
    def trap(self, height):
        n = len(height)
        if (n <= 0): return 0

        water = 0

        maxLeft, left = height[0], 0
        maxRight, right = height[n-1], n-1


        while(left < right):
            if(height[left] <= height[right]):
                left += 1
                
                temp = min(maxLeft,maxRight) - height[left]

                if temp > 0:
                    water += temp

                maxLeft = max(maxLeft,height[left])

            elif(height[left] > height[right]):
                right -= 1
                
                temp = min(maxLeft,maxRight) - height[right]
                
                if temp > 0:
                    water += temp

                maxRight = max(maxRight,height[right])
        
        return water
