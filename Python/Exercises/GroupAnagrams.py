def groupAnagrams(strs):
    my_map = {}
    for i in range(len(strs)):
        sorted_lst = sorted(strs[i])
        new_str = ''.join(sorted_lst)
        if new_str not in my_map:
            my_map[new_str] = []
        my_map[new_str].append(strs[i])
       
    return list(my_map.values())
    



strs = ["act","pots","tops","cat","stop","hat"]
print(groupAnagrams(strs))


# strs = ["eat","tea","tan","ate","nat","bat"]
# strs.sort()
# print(strs)


# to not forget the algo i will write in here (i thought about this)
# we will take an approach by taking the first element and storing it in a dic(hashmap)
# with a value of one then we will take that element and look for its anagrams in the list
# and store them as key value pairs where the key is the string in the list
# and the value will be the number we defined at first eg:1 that will change once the anagrams are not left
# then we will take the dic , run a loop and get the keys and store them in a list all based on their values that are equal



# or there is another aproach , what if we take a the sorted string of the first element and store in the hash map as our first key
# then traverse our list looking for all the strings that their sorted value matches the one we have in the dict 
# and then we can store them in a list and put them as value to that key 