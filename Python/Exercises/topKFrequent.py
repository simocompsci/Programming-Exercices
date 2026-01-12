def topKFrequent(nums , k):
    count = {}
    arr = [[] for i in range(len(nums) + 1)]

    for n in nums:
        count[n] = 1 + count.get(n , 0)

    for n , c in count.items():
        arr[c].append(n)

    res = []
    for i in range(len(arr) - 1 , 0 , -1):
        for n in arr[i]:
            res.append(n)
            if len(res) == k:
                return res




print(topKFrequent([1,1,1,2,2,3] , 2))

#  Bucket Sort
# Intuition
# Each number in the array appears a certain number of times, and the maximum possible frequency is the length of the array.
# We can use this idea by creating a list where the index represents a frequency, and at each index we store all numbers that appear exactly that many times.

# For example:

# All numbers that appear 1 time go into group freq[1].
# All numbers that appear 2 times go into group freq[2].
# And so on.
# After we build these groups, we look from the highest possible frequency down to the lowest and collect numbers from these groups until we have k of them.
# This way, we directly jump to the most frequent numbers without sorting all the elements by frequency.

# Algorithm:
# Build a frequency map that counts how many times each number appears.
# Create a list of groups freq, where freq[i] will store all numbers that appear exactly i times.
# For each number and its frequency in the map, add the number to freq[frequency].
# Initialize an empty result list.
# Loop from the largest possible frequency down to 1:
# For each number in freq[i], add it to the result list.
# Once the result contains k numbers, return it.