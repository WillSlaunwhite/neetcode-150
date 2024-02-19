def is_anagram(s: str, t: str) -> bool:
    list1 = list(s)
    list1.sort()

    list2 = list(t)
    list2.sort()

    return list1 == list2