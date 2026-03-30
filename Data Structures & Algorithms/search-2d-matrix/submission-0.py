import numpy as np

def search(nums, target):
        lenght = len(nums)
        if lenght <= 0: return -1
        high = lenght - 1
        low = 0
        while (low <= high):
            mid = (low + high) // 2 
            if (nums[mid] == target): return True
            
            elif nums[mid] > target : 
                high = mid - 1

            elif nums[mid] < target : 
                low = mid - -1
                  
        return False
    

class Solution(object):
    
    def searchMatrix(self, matrix, target):
        flat = np.array(matrix, dtype=object).flatten()
        return search(flat, target)