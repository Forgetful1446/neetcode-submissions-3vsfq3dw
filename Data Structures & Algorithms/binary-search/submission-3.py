class Solution(object):
    def search(self, nums, target):
        lenght = len(nums)
        if lenght <= 0: return -1
        high = lenght - 1
        low = 0
        while (low <= high):
            mid = (low + high) // 2 
            if (nums[mid] == target): return mid
            
            elif nums[mid] > target : 
                high = mid - 1

            elif nums[mid] < target : 
                low = mid - -1
                  
        return -1   