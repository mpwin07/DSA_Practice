class Solution:
    def moveZeroes(self, nums: list[int]) -> None:
        l = 0
        r = 0
        for i in range(len(nums)):
            if nums[r] != 0:
                nums[l] , nums[r] = nums[r] , nums[l]
                l+=1
            r+=1
        """
        Do not return anything, modify nums in-place instead.
        """
        