def MaxAvg(arr , k):
    n = len(arr)
    if k == 1 and n == 1:
        return arr[0]
    
    window_sum = sum(arr[:k])

    max_sum = float(window_sum)


    for i in range(n - k):
        window_sum = window_sum - arr[i] + arr[i + k]
        max_sum = (max(window_sum, max_sum))
    
    return max_sum / k


if __name__ == "__main__":
    arr = [1,12,-5,-6,50,3]
    k = 4
    print(MaxAvg(arr , k))