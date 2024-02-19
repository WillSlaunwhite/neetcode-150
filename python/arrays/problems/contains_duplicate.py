def contains_duplicate(nums: list[int]) -> bool:
    my_set = set(nums)
    return len(my_set) != len(nums)


def contains_duplicate_alt(nums: list[int]) -> bool:
    my_set = set()
    for num in nums:
        if num in my_set:
            return True
        else:
            my_set.add(num)