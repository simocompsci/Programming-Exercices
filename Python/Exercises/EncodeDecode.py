def encode(self, strs: List[str]) -> str:
    return "hello"

def decode(self, s: str) -> List[str]:
    return "hi"


# this is the problem set of encode decode strings of the neetcode 150


# The algorithm we are trying to write is not an algorithm that takes one string and ecodes and decodes it.
# what we are trying to achieve is an algorithm that takes a LIST of strings and encodes it to ONE string.

# The second part of it is to take that resulted string of the encode function and put it in the decode function
# to get back the first LIST of strings


# first Approach:
# taking the input list of strings , taking each string and encodind it and storing it with it's length i a datastrucutre
# then concatinating the strings together to get the result of the first function 
# then for the second function taking that string , starting from index 0 , taking a string at time using the length of it
# and then appending it to a list that will match the first input list hopefully

