from typing import Optional
from linked_list.list_node import ListNode
from linked_list.problems.add_two_numbers import add_two_numbers


def test_add_two_numbers_first_case(
    convert_linked_list_to_array, convert_array_to_linked_list
) -> None:
    l1: Optional[ListNode] = convert_array_to_linked_list([2, 4, 3])
    l2: Optional[ListNode] = convert_array_to_linked_list([5, 6, 4])
    expected_result: list[int] = [7, 0, 8]
    result: Optional[ListNode] = add_two_numbers(l1, l2)
    assert expected_result == convert_linked_list_to_array(result)
