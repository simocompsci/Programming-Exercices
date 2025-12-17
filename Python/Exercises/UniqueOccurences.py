def uniqueOccurrences(arr: list[int]) -> bool:
    my_map = {}

    for num in arr:
        if num not in my_map:
            my_map[num] = arr.count(num)

    values = list(my_map.values())

    return len(values) == len(set(values))





print(uniqueOccurrences([2,2]))