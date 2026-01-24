# def encode(self, strs: List[str]) -> str:
#     return "hello"

# def decode(self, s: str) -> List[str]:
#     return "hi"


s = "Hello, World!"

encoded_text = s.encode()
print(list(encoded_text))


# this is the problem set of encode decode strings of the neetcode 150


# The algorithm we are trying to write is not an algorithm that takes one string and ecodes and decodes it.
# what we are trying to achieve is an algorithm that takes a LIST of strings and encodes it to ONE string.

# The second part of it is to take that resulted string of the encode function and put it in the decode function
# to get back the first LIST of strings


# What the problem asks of us is to take the list of strings , join them in single string containing metadata and infromation 
# that will help the second function decode it back the original LIST




# Correct Approach: