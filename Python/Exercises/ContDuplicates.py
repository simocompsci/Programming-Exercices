def ContainsDuplicates(nums):
    my_set = set(nums)
    if len(my_set) == len(nums):
        return False
    else:
        return True



arr = [1,2,3,4,1]
print(ContainsDuplicates(arr))