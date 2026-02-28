def ProductExceptSelf(nums):
    product = 1
    for i in range(len(nums)):
        if nums[i] == 0:
            continue
        product *= nums[i]
    return product


nums = [1,2,3,8]
nums1 = [1,2,0,-1,3]

print(ProductExceptSelf(nums))