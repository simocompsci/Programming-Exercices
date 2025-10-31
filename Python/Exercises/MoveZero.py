def moveZeroes(nums):
    if len(nums) < 2:
        return nums
    else:
        pivot = 0
        left = [i for i in nums if i != pivot]
        right = [i for i in nums if i == pivot]

        nums = left + right
        return nums
    
    
numbers = [0,1,0,3,12]
print(moveZeroes(numbers))

 # temp = 0
        # if len(nums) < 2:
        #         return nums
        # else:
        #         for i in range(len(nums) - 1):
        #                 for j in range(len(nums) - 1 - i):
        #                     if nums[j] == 0:
        #                             temp = nums[j]
        #                             nums[j] = nums[j+1]
        #                             nums[j+1] = temp
        #                     else:
        #                             continue  
        #         return nums