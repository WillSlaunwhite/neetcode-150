from arrays.problems.contains_duplicate import contains_duplicate

def test_contains_duplicate_first_case() -> None:
    nums = [1, 2, 3, 1]
    assert contains_duplicate(nums) == True

def test_contains_duplicate_second_case() -> None:
    nums = [1, 2, 3, 4]
    assert contains_duplicate(nums) == False

def test_contains_duplicate_thrid_case() -> None:
    nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
    assert contains_duplicate(nums) == True