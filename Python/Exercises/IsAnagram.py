def isAnagram(s , t):
    
    if len(s) != len(t):
        return False
    else:
        if sorted(s) == sorted(t):
            return True
        else:
            return False

print(isAnagram("anigram" , "nagaram"))