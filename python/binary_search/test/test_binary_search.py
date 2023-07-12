from binary_search.problems.binary_search import binary_search


def test_binary_search_first_case() -> None:
    input = [-1, 0, 3, 5, 9, 12]
    target = 9
    expected_output = 4
    assert binary_search(input, target) == expected_output


def test_binary_search_second_case() -> None:
    input = [-1, 0, 3, 5, 9, 12]
    target = 2
    expected_output = -1
    assert binary_search(input, target) == expected_output
