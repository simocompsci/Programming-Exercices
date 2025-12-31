def topKFrequent(nums , k):
    return 1



# initial approach:

# i will take the elements of the array , count their iterations 
# and store them with their count in a hashmap key->nums[i] values->nums[i].count()
# and then find a way to get the values sorted based on their value
# then store them in a list and get the k first elemnts of the list