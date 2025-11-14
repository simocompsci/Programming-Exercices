def DiffTwoArr(nums1 , nums2):
    res1 = []
    res2 = []
    for i in range(len(nums1)):
        if nums1[i] not in nums2:
            if nums1[i] in res1:
                continue
            else:
                res1.append(nums1[i])
            

    for i in range(len(nums2)):
        if nums2[i] not in nums1:
            if nums2[i] in res2:
                continue
            else:
                res2.append(nums2[i])
            
    return [res1 , res2]


print(DiffTwoArr([1,2,3,3], [1,1,2,2]))