def encode(strs: list[str]) -> str:
    encoded_string = ""
    for item in strs:
        length = len(item)
        encoded_string += str(length) + "#" + item 
    return encoded_string

# now i need to extract the length using a loop before reaching the # character,
        # and once reaching it i need to start extracting the string based on the length,
        # i can do this by starting at index 0 and using a while loop to check if i != #,
        # then i use the length to extract the string and then move ahead

def decode(s: str):
    res_list = []
    string_item = ""
    extracted_len = ""
    i = 0
    while s[i] != "#":
        extracted_len += s[i]
        i += 1
    string_item = s[i + 1 : i + 1 +int(extracted_len)]
    res_list.append(string_item)
    i = int(extracted_len) + 2
    print(extracted_len)
    print(string_item)
    return res_list

        
        




strings = ["momo" , "hassan" , "mounir" , "lalam" , "blibli"]
print(encode(strings))
res_string = encode(strings)
print(decode(res_string))





# this is the problem set of encode decode strings of the neetcode 150


# The algorithm we are trying to write is not an algorithm that takes one string and ecodes and decodes it.
# what we are trying to achieve is an algorithm that takes a LIST of strings and encodes it to ONE string.

# The second part of it is to take that resulted string of the encode function and put it in the decode function
# to get back the first LIST of strings


# What the problem asks of us is to take the list of strings , join them in single string containing metadata and infromation 
# that will help the second function decode it back the original LIST




# Correct Approach:
# We can use an encoding approach where we start with a number representing the length of the string, 
# followed by a separator character (let's use # for simplicity), and then the string itself. To decode, 
# we read the number until we reach a #, then use that number to read the specified number of characters as the string.

# you may ask why use a # in the string , it's because we could have a long string (eg: 1000 character) and storing the 
# length of that string will require us to first loop until we find the # so we can extract the length correctly