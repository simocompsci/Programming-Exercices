def topKFrequent(nums , k):
    
    return 1



topKFrequent()

# initial approach:
# myList = []
#     stats = {'a': 1, 'b': 3000, 'c': 0}
    
    
#     for i in range(2):
#         max_key = max(stats , key=stats.get)
#         myList.append(stats.pop(max_key))
    

#     print(myList)


# i will take the elements of the array , count their iterations 
# and store them with their count in a hashmap key->nums[i] values->nums[i].count()
# and then find a way to get the keys sorted based on their value
# then store them in a list and get the k first elemnts of the list


# Second and correct approach is to use the bucket sort algorithm