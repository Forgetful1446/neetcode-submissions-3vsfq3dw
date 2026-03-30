class Solution(object):
    def productExceptSelf(self, nums):
        zeroCount = 0
        product = 1
        for i in nums:
            if i != 0:
                product *= i
            else:
                zeroCount += 1

        if zeroCount > 1: return [0] * len(nums)
        result = [0] * len(nums)

        for j in range(len(nums)):
            if nums[j] == 0:
                result[j] = product
            elif zeroCount == 1 and nums != 0:
                result[j] = 0
            else:
                result[j] = product / nums[j]
        return [int(x) for x in result] 