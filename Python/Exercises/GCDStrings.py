def GCDStrings(str1 , str2):
    x = ""
    x += str1[0]
    for i in range(len(str1) - 1):
        if str1[0] != str1[i+1]:
            x += str1[i + 1]
        else:
            break

    str1Times = len(str1) // len(x)
    str2Times = len(str2) // len(x)
    if str2Times > 1:
        x *= str2Times
        return x
    else:
        if (x*str1Times) == str1 and (x*str2Times) == str2:
            return x
        else:
            return ""
    



print(GCDStrings("ABABAB" , "ABAB"))