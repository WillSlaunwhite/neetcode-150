from linked_list.problems.merge_two_sorted_lists import (
    merge_two_sorted_lists_iterative,
    merge_two_sorted_lists_recursive,
)


def test_merge_recursive_first_case(
    convert_array_to_linked_list, convert_linked_list_to_array
) -> None:
    list1 = convert_array_to_linked_list([1, 2, 4])
    list2 = convert_array_to_linked_list([1, 3, 4])
    expected_output = [1, 1, 2, 3, 4, 4]

    result = merge_two_sorted_lists_recursive(list1, list2)

    assert convert_linked_list_to_array(result) == expected_output


def test_merge_recursive_on_empty_arrays(convert_linked_list_to_array) -> None:
    list1 = list2 = None
    expected_output = []

    result = merge_two_sorted_lists_recursive(list1, list2)

    assert convert_linked_list_to_array(result) == expected_output


def test_merge_iterative(
    convert_array_to_linked_list, convert_linked_list_to_array
) -> None:
    list1 = convert_array_to_linked_list([1, 2, 4])
    list2 = convert_array_to_linked_list([1, 3, 4])
    expected_output = [1, 1, 2, 3, 4, 4]

    result = merge_two_sorted_lists_iterative(list1, list2)

    assert convert_linked_list_to_array(result) == expected_output


def test_merge_iterative_on_empty_arrays(convert_linked_list_to_array) -> None:
    list1 = list2 = None
    expected_output = []

    result = merge_two_sorted_lists_iterative(list1, list2)

    assert convert_linked_list_to_array(result) == expected_output
