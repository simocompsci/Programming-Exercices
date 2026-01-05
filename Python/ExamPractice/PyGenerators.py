def squarembers(nums):
    squared = []
    n = len(nums)
    for i in range(1,n+1):
        squared.append(i*i)
    return squared

nums = [1,2,3,4,5,6,7,8,9]

squared = (x*x for x in nums)
print(list(squared))
print(squarembers(nums))


# using next()
# this function prints the next value in the generator , and if it's the start it prints index's 0 value
# print(next(squared))

# we can write a loop 
for i in nums:
    print(next(squared))


def counter(max):
    n = 0
    while n < max:
        yield n
        n += 1

gen = counter(5)
for n in gen:
    print(n)