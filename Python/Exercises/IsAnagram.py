def isAnagram(s , t):

    if len(s) != len(t):
        return False
    else:
        if sorted(s) == sorted(t):
            return True
        else:
            return False

print(isAnagram("anigram" , "nagaram"))

# strs = ["eat","tea","tan","ate","nat","bat"]
# strs.sort()
# print(strs)


# to not forget the algo i will write in here (i thought about this)
# we will take an approach by taking the first element and storing it in a dic(hashmap)
# with a value of one then we will take that element and look for its anagrams in the list
# and store theù as key value pairs where the key is the string in the list
# and the value will be the number we defined at first eg:1 that will change once the anagrams are not left
# then we will take the dic , run a loop and get the keys and store them in a list all based on their values that are equal