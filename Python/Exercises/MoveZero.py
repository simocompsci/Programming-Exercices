def moveZeroes(nums):
        temp = 0
        if len(nums) < 2:
                return nums
        else:
                for i in range(len(nums) - 1):
                        for j in range(len(nums) - 1 - i):
                            if nums[j] == 0:
                                    temp = nums[j]
                                    nums[j] = nums[j+1]
                                    nums[j+1] = temp
                            else:
                                    continue  
                return nums



numbers = [1,4,0,12,3,0,66,55,88,0,1,0,7,0]
print(moveZeroes(numbers))