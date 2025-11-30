import numpy as np
array = np.array([
    [1,2,3,4] , 
    [5,6,7,8] , 
    [9,10,11,12]
    ])
print(array.ndim) # number of dimensions
print(array.shape) # returns a tuple representing the shape of the nparray
print(array.size) # how many elements in the whole array
print(array.dtype)


# Slicing
# for the slicing you can look  more and practice more but you get the idea
print(array[::-2 , 0]) # prints the index we want of each row of the 2d array (we can shape the parameters as we want)

# Arithmetic
